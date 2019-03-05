/* function loadJSON() {   

    var xobj = new XMLHttpRequest();
        xobj.overrideMimeType("application/json");
    xobj.open('GET', 'http://localhost:2000/latestrecordvalue', true); // Replace 'my_data' with the path to your file
    xobj.onreadystatechange = function () {
          if (xobj.readyState == 4 && xobj.status == "200") {
              alert(xobj.responseText)
            // Required use of an anonymous callback as .open will NOT return a value but simply returns undefined in asynchronous mode
            //callback(xobj.responseText);
    console.log(response);
            
          }
    };
    xobj.send(null);  
 }
 
 loadJSON(); */
 
 
 function httpGet()
{
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", 'http://localhost:2000/latestrecordvalue', false ); // false for synchronous request
	
    xmlHttp.send( null );
	alert(xmlHttp.responseText)
    return xmlHttp.responseText;
}

var responsedata=httpGet();