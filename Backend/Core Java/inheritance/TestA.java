
public class TestA {
public static void main(String[] args) {
	FirstGeneration fg=new FirstGeneration();
	fg.call();
	fg.msg();
	SecondGeneration sg=new SecondGeneration();
	sg.call();
	sg.msg();
	sg.radio();
	ThirdGeneration tg=new ThirdGeneration();
	tg.call();
	tg.msg();
	tg.radio();
	tg.camera();
	FirstGeneration sg1= new SecondGeneration();
	sg1.call();
	sg1.msg();
	SecondGeneration tg1=new ThirdGeneration();
	tg1.call();
	tg1.msg();
	tg1.radio();
}
}
