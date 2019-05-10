fun main(args : Array<String>){
    varTest()//읽고 쓰기 가능한 변수
    valTest()//읽기만 가능한 변수
}

fun varTest(){
    //1.변수의 타입을 미리 정함
    //아래는 초기화하지 않아도 됨.
    var num : Int
    num=1
    /*2. 변수의 타입을 정하지 않음
    아래는 초기화 반드시 해야함
    var numver  <-이건 오류
     */
    var number = 2
    /*
    number = "" 이것도 에러임
    즉, 선언과 함께 초기화를 하면 알아서 타입을 정하는 기능 정도인듯;;;;
     */
}

fun valTest(){
    //val은 const와 같은 읽기 전용값임
    val num=1
    val name : String
    name = ""
    //에러임 이미 할당한 값을 재할당 못함. name = "재할당 못함"
}