/**
 * �J�����_�[��\������
 * @url
 * http://cly7796.net/wp/javascript/create-a-calendar-with-javascript/
 * jQuery�̐ݒu
 * http://web-pc.net/jquery001
 * �N���b�N��
 * http://lifelog.main.jp/wordpress/?p=2146
 */

window.onload = function() {
    // ���݂̔N���̎擾
    var current = new Date();
    var year = current.getFullYear();
    var month = current.getMonth() + 1;

    // �J�����_�[�̕\��
    var wrapper = document.getElementById('calendar');
    add_calendar(wrapper, year, month);

    $('.calendar-table tbody td').live('click',function(){

    	  var $cur_yearMonth = $('.calendar-header__title')[0].innerText;

    	  var $cur_td = $(this)[0].innerText; // (1):�Z����HTML�\�� [0]������_�ɗ��ӂ̂��ƁB���ɂ��̎擾
    	  var $cur_tr = $(this).parent()[0]; // (2):�s��HTML�\��
    	  var $cur_td_mozi  =String($cur_td);

    	  var $cur_td2 = ($cur_td_mozi.replace(/<("[^"]*"|'[^']*'|[^'">])*>/g,''));

    	  // $cur_tr = $(this).closest('tr')[0]; // ���̂ق����m��
    	  console.log($cur_td);
    	  console.log($cur_yearMonth);
    	  //console.log($cur_tr);

    	  const textarea2 = document.form1.textarea2;
    	  var day = $cur_td.concat('�� 20:00�`');
    	  var month2 = month + '��';
    	  var year2 = year + '�N';
    	  var yearMonth = $cur_yearMonth;
    	  if(textarea2.value == ''){
    		  textarea2.value = yearMonth + day;
    	  } else {
    		  textarea2.value = textarea2.value + '\n' + yearMonth + day;
    	  }

    	  /* �N�}�^�M���s�
      	  textarea2.value = year2 + month2 + day;
    	  } else {
    		  textarea2.value = textarea2.value + '\n' + year2 + month2 + day;
    	  }
    	  */

    });

      $('#button').on('click', function() {

     	 var $nameValue = $('input[name="name1"]').val();

     	if($nameValue == ""){
    		alert("�C�x���g������͂��Ă�������");
    		return false;
    	}
    });

}


/**
 * �w�肵���N���̃J�����_�[��\������
 * @param {object} wrapper - �J�����_�[��ǉ�����e�v�f
 * @param {number} year    - �N�̎w��
 * @param {number} month   - ���̎w��
 */
function add_calendar(wrapper, year, month) {
    // ���݃J�����_�[���ǉ�����Ă���ꍇ�͈�U�폜����
    wrapper.textContent = null;

    // �J�����_�[�ɕ\��������e���擾
    var headData = generate_calendar_header(wrapper, year, month);
    var bodyData = generate_month_calendar(year, month);

    // �J�����_�[�̗v�f��ǉ�
    wrapper.appendChild(headData);
    wrapper.appendChild(bodyData);
}

/**
 * �w�肵���N���̃J�����_�[�̃w�b�_�[�v�f�𐶐����ĕԂ�
 * @param {object} wrapper - �J�����_�[��ǉ�����e�v�f
 * @param {number} year    - �N�̎w��
 * @param {number} month   - ���̎w��
 */
function generate_calendar_header(wrapper, year, month) {
    // �O���Ɨ������擾
    var nextMonth = new Date(year, (month - 1));
    nextMonth.setMonth(nextMonth.getMonth() + 1);
    var prevMonth = new Date(year, (month - 1));
    prevMonth.setMonth(prevMonth.getMonth() - 1);

    // �w�b�_�[�v�f
    var cHeader = document.createElement('div');
    cHeader.className = 'calendar-header';

    // ���o���̒ǉ�
    var cTitle = document.createElement('div');
    cTitle.className = 'calendar-header__title';
    var cTitleText = document.createTextNode(year + '�N' + month + '��');
    cTitle.appendChild(cTitleText);
    cHeader.appendChild(cTitle);

    // �O���{�^���̒ǉ�
    var cPrev = document.createElement('button');
    cPrev.className = 'calendar-header__prev';
    var cPrevText = document.createTextNode('prev');
    cPrev.appendChild(cPrevText);
    // �O���{�^�����N���b�N�������̃C�x���g�ݒ�
    cPrev.addEventListener('click', function() {
        add_calendar(wrapper, prevMonth.getFullYear(), (prevMonth.getMonth() + 1));
    }, false);
    cHeader.appendChild(cPrev);

    // �����{�^���̒ǉ�
    var cNext = document.createElement('button');
    cNext.className = 'calendar-header__next';
    var cNextText = document.createTextNode('next');
    cNext.appendChild(cNextText);
    // �����{�^�����N���b�N�������̃C�x���g�ݒ�
    cNext.addEventListener('click', function() {
        add_calendar(wrapper, nextMonth.getFullYear(), (nextMonth.getMonth() + 1));
    }, false);
    cHeader.appendChild(cNext);

    return cHeader;
}

/**
 * �w�肵���N���̃J�����_�[�v�f�𐶐����ĕԂ�
 * @param {number} year  - �N�̎w��
 * @param {number} month - ���̎w��
 */
function generate_month_calendar(year, month) {
    var weekdayData = ['��', '��', '��', '��', '��', '��', '�y'];
    // �J�����_�[�̏����擾
    var calendarData = get_month_calendar(year, month);

    var i = calendarData[0]['weekday']; // �����̗j�����擾
    // �J�����_�[��̏������O�𖄂߂�
    while(i > 0) {
        i--;
        calendarData.unshift({
            day: '',
            weekday: i
        });
    }
    var i = calendarData[calendarData.length - 1]['weekday']; // �����̗j�����擾
    // �J�����_�[��̖�������𖄂߂�
    while(i < 6) {
        i++;
        calendarData.push({
            day: '',
            weekday: i
        });
    }

    // �J�����_�[�̗v�f�𐶐�
    var cTable = document.createElement('table');
    cTable.className = 'calendar-table';

    var insertData = '';
    // �j�������̐���
    insertData += '<thead>';
    insertData += '<tr>';
    for (var i = 0; i < weekdayData.length; i++) {
        insertData += '<th>';
        insertData += weekdayData[i];
        insertData += '</th>';
    }
    insertData += '</tr>';
    insertData += '</thead>';

    // ���t�����̐���
    insertData += '<tbody>';
    for (var i = 0; i < calendarData.length; i++) {
        if(calendarData[i]['weekday'] <= 0) {
            insertData += '<tr>';
        }
        insertData += '<td>';
        insertData += calendarData[i]['day'];
        insertData += '</td>';
        if(calendarData[i]['weekday'] >= 6) {
            insertData += '</tr>';
        }
    }
    insertData += '</tbody>';

    cTable.innerHTML = insertData;
    return cTable;
}

/**
 * �w�肵���N���̃J�����_�[����Ԃ�
 * @param {number} year  - �N�̎w��
 * @param {number} month - ���̎w��
 */
function get_month_calendar(year, month) {
    var firstDate = new Date(year, (month - 1), 1); // �w�肵���N���̏����̏��
    var lastDay = new Date(year, (firstDate.getMonth() + 1), 0).getDate(); // �w�肵���N���̖���
    var weekday = firstDate.getDay(); // �w�肵���N���̏����̗j��

    var calendarData = []; // �J�����_�[�̏����i�[
    var weekdayCount = weekday; // �j���̃J�E���g�p
    for (var i = 0; i < lastDay; i++) {
        calendarData[i] = {
            day: i + 1,
            weekday: weekdayCount
        }
        // �j���̃J�E���g��6(�y�j��)�܂ł�����0(���j��)�ɖ߂�
        if(weekdayCount >= 6) {
            weekdayCount = 0;
        } else {
            weekdayCount++;
        }
    }
    return calendarData;
}