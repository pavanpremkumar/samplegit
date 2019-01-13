 var score=0;
 var total=3;
 var point=1;
 var highest=total*point;
   function init(){
       sessionStorage.setItem('a1','b');
       sessionStorage.setItem('a2','c');
       sessionStorage.setItem('a3','d');
   }
$(document).ready(function(){
      //Hide all questions
      $('.questionForm').hide();
     //show quessetions 
    $('#q1').show();
    $('#q1 #submit').click(function(){
     $('.questionForm').hide();
     process('q1');
     $('#q2').fadeIn(200);
      return false;
    });

      $('#q2 #submit').click(function(){
        $('.questionForm').hide();
        process('q2');
        $('#q3').fadeIn(200);
         return false;
        });
         $('#q3 #submit').click(function(){
            $('.questionForm').hide();
            process('q3');
            $('#results').fadeIn(200);
             return false;


    });
    });
             function process(q){
                 if(q="q1"){
                     var submitted=$('input[name=q1]:checked').val();
                     if(submitted==sessionStorage.a1){
                         score++;
                     }
                 }
                 if(q="q2"){
                    var submitted=$('input[name=q2]:checked').val();
                    if(submitted==sessionStorage.a2){
                        score++;
                    }
                }
                if(q="q3"){
                    var submitted=$('input[name=q3]:checked').val();
                    if(submitted==sessionStorage.a3){
                        score++;
                    }
                    $('#results').html('<h3>Your final score is:'+score+' out of 3</h3><a href="index.html">Thank you</a>')
                }
                return false;
            }
   window.addEventListener('load',init,false); 