/**
 * カレンダーを表示する
 * @url
 * http://cly7796.net/wp/javascript/create-a-calendar-with-javascript/
 * jQueryの設置
 * http://web-pc.net/jquery001
 * クリック時
 * http://lifelog.main.jp/wordpress/?p=2146
 */

window.onload = function() {
    // 現在の年月の取得
    var current = new Date();
    var year = current.getFullYear();
    var month = current.getMonth() + 1;

    console.log(location.href);

    if(location.href == "http://localhost:8080/yoteihyo/present.jsp" ){
    	// 想定文字列「2018年11月11日 20:00, 2019年1月14日 20:00, 2019年1月14日 20:00, 2019年1月29日 20:00,」

        // 出欠可否の表示
        var wrapper = document.getElementById('niti');
        add_present(wrapper);

/*
    	var splited = window.sessionStorage.getItem(['key1']).split(",");
    	while(i < splited.length) {
    	document.getElementById('niti').innerHTML = splited[i];
    	// 「|0」JSに直でJITコンパイラ型よりINT認識させることで高速化
    	i=(i+1)|0;
    	}
*/
    	// 成功 document.getElementById('niti').innerHTML = window.sessionStorage.getItem(['key1']);
    		//没 window.sessionStorage.getItem(['key1']);

    }

    if(location.href == "http://localhost:8080/yoteihyo/attendeeItiran.jsp" ){
    	// イベント名のIDNO 「出欠表の一覧」のNoを取得する
    	var wrapper = document.getElementById('IDNO');
    	add_attendeeItiran(wrapper);

    }

    /*
     * itiran.jsp用 「出欠の登録はココ！」ボタン
     */
     $('button[name="button"]').on('click', function() {

  	  	var $cur_tr = $(this).parent().parent()[0].children[4].innerText; // (2):行のHTML表現
  	    var cur_tr = $cur_tr.split("〜");
  	  	console.log($cur_tr);

  	  	var IDNO = $(this).parent().parent()[0].children[1].innerText;

  	  	// 参考URL「https://www.tagindex.com/javascript/window/open1.html」
  	  	// https://qiita.com/shuntaro_tamura/items/99adbe51132e0fb3c9e9
    	disp("/yoteihyo/present.jsp", cur_tr, IDNO);

    });

     /*
      * itiran.jsp用 「出欠の一覧はココ！」ボタン
      */
      $('button[name="button2"]').on('click', function() {


   	  	var $cur_tr = $(this).parent().parent()[0].children[4].innerText; // (2):行のHTML表現
   	    var cur_tr = $cur_tr.split("〜");
   	  	console.log($cur_tr);

   	  	var IDNO = $(this).parent().parent()[0].children[1].innerText;

     	disp2("/yoteihyo/attendeeItiran.jsp", cur_tr, IDNO);

     });

    /*
     * present.jsp用 「確定ボタン」
     */
    $('#PresentButton').on('click', function() {
		var $nameValue = $('input[name="yourName"]').val();
    	var $gyo = $('input[name="gyo"]').val();

     	if($nameValue == ""){
       		alert("イベント名を入力してください");
       		return false;
     	}

    	for (var i = 0; i < $gyo; i++){
    		// var $presentPandC = $('input[name="presentPandC' + i + '"]').prop('checked');
    		var $presentPandC = $('input[name="presentPandC' + i + '"]:checked').val();

    		if($presentPandC == null){
    			alert("出欠日の参加/不参加を入力してください");
    			return false;
    		}
    	 }
	});
}

/**
 * 子画面を表示する
 * @param {object} url - URL
 * @param {object} cur_tr - 候補日程
 */
function disp(url, cur_tr, IDNO){

	// http://portaltan.hatenablog.com/entry/2015/08/05/100655
	// セッションの格納
	window.sessionStorage.setItem(['key1'], [cur_tr]);
	window.sessionStorage.setItem(['key2'], IDNO);

	// セッションの数の取得
	var size = window.sessionStorage.length
	console.log(size);

	// セッションの値の取得
	var a = window.sessionStorage.getItem(['key1']);
	console.log(a);    // => value1

	window.open(url, "window_name", "width=500,height=400,scrollbars=yes");

	// 指定したセッションの削除
	window.sessionStorage.removeItem(['key1']);
	window.sessionStorage.removeItem(['key2']);

	// 全てのセッションの削除
	window.sessionStorage.clear();
}

/**
 * 子画面を表示する2
 * @param {object} url - URL
 * @param {object} cur_tr - 候補日程
 */
function disp2(url, cur_tr, IDNO){

	// http://portaltan.hatenablog.com/entry/2015/08/05/100655
	// セッションの格納
	window.sessionStorage.setItem(['key1'], [cur_tr]);
	window.sessionStorage.setItem(['key2'], IDNO);

	// セッションの数の取得
	var size = window.sessionStorage.length
	console.log(size);

	// セッションの値の取得
	var a = window.sessionStorage.getItem(['key1']);
	console.log(a);    // => value1

	window.open(url, "window_name", "width=1280,height=720,scrollbars=yes");

	// 指定したセッションの削除
	window.sessionStorage.removeItem(['key1']);
	window.sessionStorage.removeItem(['key2']);

	// 全てのセッションの削除
	//window.sessionStorage.clear();
}


/**
 * 出欠可否を表示する
 * @param {object} wrapper - 出欠可否を追加する親要素
 */
function add_present(wrapper) {
    // 現在、出欠可否が追加されている場合は一旦削除する
    wrapper.textContent = null;

    // 出欠可否に表示する内容を取得
    var bodyData = generate_present(wrapper);

    // 出欠可否の要素を追加（HTML出力）
    wrapper.appendChild(bodyData);
}


/**
 * 指定した出欠可否の要素を生成して返す
 * @param {number} year  - 年の指定
 * @param {number} month - 月の指定
 */
function generate_present(wrapper) {
	var NitiData= window.sessionStorage.getItem(['key1']).split(",");
	var IDNO= window.sessionStorage.getItem(['key2']);

    // 日程の要素を生成
    var nTable = document.createElement('table');
    nTable.className = 'niti-table';

    var insertData = '';
    // 日程部分の生成
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
        insertData += '<input type="radio" name="presentPandC' + i + '" value="yes">参加';
        insertData += '<input type="radio" name="presentPandC' + i + '" value="no">不参加';
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
 * 参加者の一覧を表示する
 * @param {object} wrapper - 参加者の一覧を追加する親要素
 */
function add_attendeeItiran(wrapper){
    // 現在、出欠可否が追加されている場合は一旦削除する
    wrapper.textContent = null;

    // 出欠可否に表示する内容を取得
    var bodyData = generate_attendeeItiran(wrapper);

    // 出欠可否の要素を追加（HTML出力）
    wrapper.appendChild(bodyData);

    if(!(window.sessionStorage.getItem(['key3']) == "submit1回のみ")) {
    	document.ReSubmitForm.submit();
    	window.sessionStorage.setItem(['key3'], "submit1回のみ");
    }
    //document.ReSubmitForm.submit();
}


/**
 * 指定した出欠可否の要素を生成して返す
 * @param {number} year  - 年の指定
 * @param {number} month - 月の指定
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


