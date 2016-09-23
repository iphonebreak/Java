//OX퀴즈

interface A03{}

class B03{}

//클래스는 클래스를 여러 개 상속 받을 수 있다(X)

//클래스는 인터페이스를 상속받을 수 있다(O)
class C03 implements A03{}

//클래스는 클래스와 인터페이스를 동시에 상속 받을 수 있다(O)
class D03 extends B03 implements A03{}

//인터페이스는 인터페이스를 상속받을 수 있다.(O)
interface F03 extends A03{}//같은 종류끼리는 extends 사용

//인터페이스는 클래스를 상속 받을 수 없다(O)
// -> 변하는 내용이 클래스로부터 상속되기 때문에 불가능!

//인터페이스는 인터페이스를 여러 개 상속 받을 수 있다(O)
interface G03 extends A03, F03{}

//클래스는 클래스 1개와 인터페이스 여러 개를 동시에 상속 받을 수 있다(O)
class H03 extends B03 implements A03, F03, G03{}

public class Exam_03 {

}

















