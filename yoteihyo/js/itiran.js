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

    console.log(location.href);

    if(location.href == "http://localhost:8080/yoteihyo/present.jsp" ){
    	// �z�蕶����u2018�N11��11�� 20:00, 2019�N1��14�� 20:00, 2019�N1��14�� 20:00, 2019�N1��29�� 20:00,�v

        // �o���ۂ̕\��
        var wrapper = document.getElementById('niti');
        add_present(wrapper);

/*
    	var splited = window.sessionStorage.getItem(['key1']).split(",");
    	while(i < splited.length) {
    	document.getElementById('niti').innerHTML = splited[i];
    	// �u|0�vJS�ɒ���JIT�R���p�C���^���INT�F�������邱�Ƃō�����
    	i=(i+1)|0;
    	}
*/
    	// ���� document.getElementById('niti').innerHTML = window.sessionStorage.getItem(['key1']);
    		//�v window.sessionStorage.getItem(['key1']);

    }

    if(location.href == "http://localhost:8080/yoteihyo/attendeeItiran.jsp" ){
    	// �C�x���g����IDNO �u�o���\�̈ꗗ�v��No���擾����
    	var wrapper = document.getElementById('IDNO');
    	add_attendeeItiran(wrapper);

    }

    /*
     * itiran.jsp�p �u�o���̓o�^�̓R�R�I�v�{�^��
     */
     $('button[name="button"]').on('click', function() {

  	  	var $cur_tr = $(this).parent().parent()[0].children[4].innerText; // (2):�s��HTML�\��
  	    var cur_tr = $cur_tr.split("�`");
  	  	console.log($cur_tr);

  	  	var IDNO = $(this).parent().parent()[0].children[1].innerText;

  	  	// �Q�lURL�uhttps://www.tagindex.com/javascript/window/open1.html�v
  	  	// https://qiita.com/shuntaro_tamura/items/99adbe51132e0fb3c9e9
    	disp("/yoteihyo/present.jsp", cur_tr, IDNO);

    });

     /*
      * itiran.jsp�p �u�o���̈ꗗ�̓R�R�I�v�{�^��
      */
      $('button[name="button2"]').on('click', function() {


   	  	var $cur_tr = $(this).parent().parent()[0].children[4].innerText; // (2):�s��HTML�\��
   	    var cur_tr = $cur_tr.split("�`");
   	  	console.log($cur_tr);

   	  	var IDNO = $(this).parent().parent()[0].children[1].innerText;

     	disp2("/yoteihyo/attendeeItiran.jsp", cur_tr, IDNO);

     });

    /*
     * present.jsp�p �u�m��{�^���v
     */
    $('#PresentButton').on('click', function() {
		var $nameValue = $('input[name="yourName"]').val();
    	var $gyo = $('input[name="gyo"]').val();

     	if($nameValue == ""){
       		alert("�C�x���g������͂��Ă�������");
       		return false;
     	}

    	for (var i = 0; i < $gyo; i++){
    		// var $presentPandC = $('input[name="presentPandC' + i + '"]').prop('checked');
    		var $presentPandC = $('input[name="presentPandC' + i + '"]:checked').val();

    		if($presentPandC == null){
    			alert("�o�����̎Q��/�s�Q������͂��Ă�������");
    			return false;
    		}
    	 }
	});
}

/**
 * �q��ʂ�\������
 * @param {object} url - URL
 * @param {object} cur_tr - ������
 */
function disp(url, cur_tr, IDNO){

	// http://portaltan.hatenablog.com/entry/2015/08/05/100655
	// �Z�b�V�����̊i�[
	window.sessionStorage.setItem(['key1'], [cur_tr]);
	window.sessionStorage.setItem(['key2'], IDNO);

	// �Z�b�V�����̐��̎擾
	var size = window.sessionStorage.length
	console.log(size);

	// �Z�b�V�����̒l�̎擾
	var a = window.sessionStorage.getItem(['key1']);
	console.log(a);    // => value1

	window.open(url, "window_name", "width=500,height=400,scrollbars=yes");

	// �w�肵���Z�b�V�����̍폜
	window.sessionStorage.removeItem(['key1']);
	window.sessionStorage.removeItem(['key2']);

	// �S�ẴZ�b�V�����̍폜
	window.sessionStorage.clear();
}

/**
 * �q��ʂ�\������2
 * @param {object} url - URL
 * @param {object} cur_tr - ������
 */
function disp2(url, cur_tr, IDNO){

	// http://portaltan.hatenablog.com/entry/2015/08/05/100655
	// �Z�b�V�����̊i�[
	window.sessionStorage.setItem(['key1'], [cur_tr]);
	window.sessionStorage.setItem(['key2'], IDNO);

	// �Z�b�V�����̐��̎擾
	var size = window.sessionStorage.length
	console.log(size);

	// �Z�b�V�����̒l�̎擾
	var a = window.sessionStorage.getItem(['key1']);
	console.log(a);    // => value1

	window.open(url, "window_name", "width=1280,height=720,scrollbars=yes");

	// �w�肵���Z�b�V�����̍폜
	window.sessionStorage.removeItem(['key1']);
	window.sessionStorage.removeItem(['key2']);

	// �S�ẴZ�b�V�����̍폜
	//window.sessionStorage.clear();
}


/**
 * �o���ۂ�\������
 * @param {object} wrapper - �o���ۂ�ǉ�����e�v�f
 */
function add_present(wrapper) {
    // ���݁A�o���ۂ��ǉ�����Ă���ꍇ�͈�U�폜����
    wrapper.textContent = null;

    // �o���ۂɕ\��������e���擾
    var bodyData = generate_present(wrapper);

    // �o���ۂ̗v�f��ǉ��iHTML�o�́j
    wrapper.appendChild(bodyData);
}


/**
 * �w�肵���o���ۂ̗v�f�𐶐����ĕԂ�
 * @param {number} year  - �N�̎w��
 * @param {number} month - ���̎w��
 */
function generate_present(wrapper) {
	var NitiData= window.sessionStorage.getItem(['key1']).split(",");
	var IDNO= window.sessionStorage.getItem(['key2']);

    // �����̗v�f�𐶐�
    var nTable = document.createElement('table');
    nTable.className = 'niti-table';

    var insertData = '';
    // ���������̐���
    insertData += '<tbody>';

    for (var i = 0; i < NitiData.length - 1; i++) {
    	insertData += '<tr>';

    	insertData += '<th>';
    	insertData += '<label for="NitiLabel' + i + '">';
        insertData += NitiData[i];
        insertData += '</label>';
        insertData += '<input type="hidden" name="Niti' + i + '"' + 'value="' + NitiData[i] + '">';
        insertData += '</th>';
    	insertData += '<th>';
        insertData += '<input type="radio" name="presentPandC' + i + '" value="yes">�Q��';
        insertData += '<input type="radio" name="presentPandC' + i + '" value="no">�s�Q��';
        insertData += '</th>';

        insertData += '</tr>';
    }

    insertData += '<input type="hidden" name="gyo" value=' + (NitiData.length -1) + '>';
    insertData += '<input type="hidden" name="IDNO" value=' + IDNO + '>';
    insertData += '</tbody>';

    nTable.innerHTML = insertData;
    return nTable;
}


/**
 * �Q���҂̈ꗗ��\������
 * @param {object} wrapper - �Q���҂̈ꗗ��ǉ�����e�v�f
 */
function add_attendeeItiran(wrapper){
    // ���݁A�o���ۂ��ǉ�����Ă���ꍇ�͈�U�폜����
    wrapper.textContent = null;

    // �o���ۂɕ\��������e���擾
    var bodyData = generate_attendeeItiran(wrapper);

    // �o���ۂ̗v�f��ǉ��iHTML�o�́j
    wrapper.appendChild(bodyData);

    if(!(window.sessionStorage.getItem(['key3']) == "submit1��̂�")) {
    	document.ReSubmitForm.submit();
    	window.sessionStorage.setItem(['key3'], "submit1��̂�");
    }
    //document.ReSubmitForm.submit();
}


/**
 * �w�肵���o���ۂ̗v�f�𐶐����ĕԂ�
 * @param {number} year  - �N�̎w��
 * @param {number} month - ���̎w��
 */
function generate_attendeeItiran(wrapper) {
	var IDNO= window.sessionStorage.getItem(['key2']);

	var element = document.createElement('div');
	element.id = "idNoElement";

	var insertData = '';

    insertData += '<input type="hidden" name="idNo"' + 'value="' + IDNO + '">';

    element.innerHTML = insertData;
    return element;
}

