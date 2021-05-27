
public class Time {
	
	int hour,min,sec;
	Time(){
		hour=0;
		min=0;
		sec=0;
	}
	
	Time(int hour,int minute,int second){
		this.hour=hour;
		this.min=minute;
		this.sec=second;
	}
	
	public Time add(Time t2) {
		boolean flagsec,flagmin;
		
		Time t1=new Time();
		t1.sec=this.sec+t2.sec;
		if(t1.sec>60) {
			flagsec=true;
			t1.sec -=60;
		}
		
		t1.min=this.min+t2.min;
		if(flagsec=true) {
			t1.min=t1.min+1;
		}
		if(t1.min>60) {
			flagmin=true;
			t1.min -=60;
			
		}
		
		t1.hour=this.hour+t2.hour;
		if(flagsec=true) {
			t1.hour=t1.hour+1;
		}
		if(t1.hour>24) {
			t1.hour -=24;
		}
		
	return t1;}
	public void Display() {
		System.out.println("Latest time-  "+hour+":"+min+":"+sec);
	}
	
	
	
	public static void main(String []args) {
		
		Time time1=new Time(10,18,50);

		Time time2=new Time(0,58,11);
		
		Time time3=time2.add(time1);
		
		time1.add(time2);
		time1.Display();
		time2.Display();
		time3.Display();
	}

}
