
public class Schlange {
	
	Kunde pKunde = new Kunde("Kunde");
	Kunde Kunde1 = new Kunde("Bernd");
	Kunde Kunde2 = new Kunde("Britta");
	Kunde Kunde3 = new Kunde("Brian");
	Kunde Kunde4 = new Kunde("Braten");
	Kunde Kunde5 = new Kunde("Brot");

	


	public void schlangeFuellen() {
		Queue<Kunde> schlangeM = new Queue<Kunde>();
		
		
		schlangeM.isEmpty();
		if(schlangeM.isEmpty()==true) {
		schlangeM.enqueue(Kunde1);
		schlangeM.enqueue(Kunde2);
		schlangeM.enqueue(Kunde3);
		schlangeM.enqueue(Kunde4);
		schlangeM.enqueue(Kunde5);
		

			if(schlangeM.front()==Kunde1) {
				System.out.println("Wer das liest ist dumm");}
			}
		schlangeM.front();
		while(!schlangeM.isEmpty())
		{System.out.println(schlangeM.front().getName());
		schlangeM.dequeue();
	}
		
	}
}