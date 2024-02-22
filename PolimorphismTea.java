package task10;

public class PolimorphismTea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tea[] obj = new Tea[3];
        obj[0] = new BlackTea();
        obj[1] = new GreenTea();
        obj[2] = new HerbalTea();

        for (Tea process : obj) 
        {
        	process.prepareTea();
        	process.addMilk();
        	process.addSugar();
            System.out.println();

	}
	}
}
