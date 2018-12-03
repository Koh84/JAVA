//What is the point of having down conversion???
//let say i want you to print if son is playgame wherease you daugther is dance, how to do?
//The answer is first upconvert and then down convert

//Upper conversion
//Father f = son; /*upper conversion*/
//Father will use son's override method
//if son does not have this method override, it will use its own method
//also, Father can only use it's own methods unless if the above occured

//Down conversion
//Father f = new Father();
//Son son = (Son)f; //The father must be casted
//                  //This will cause ClassCastException because son has more method than father
//The only way this will be fixed is 
//Father f = new Son(); //Upper conversion follow by Down conversion
//equivalent to Son son = new Son();
