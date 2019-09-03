class Time
{
 int hr,min,sec,day;
 public Time(int d,int h, int m, int s){
   hr=h;
   min=m;
   sec=s;
   day=d;
 }
 void add(Time t2){
   this.hr+=t2.hr;
   this.min+=t2.min;
   this.sec+=t2.sec;
   this.day+=t2.day;
   if(sec>60)
   {
      this.min+=1;
      this.sec-=60;
   }
   if(min>60)
   {
      this.hr+=1;
      this.min-=60;
   }
   if(hr>=24)
   {
      this.day+=this.hr/24;
      int g=this.hr/24;
      this.hr-=24*g;
   }

 }
 void display(){
   System.out.println(this.day +"d:"+ this.hr +"hr:"+ this.min +"min:"+ this.sec +"sec");
 }
 public static void main(String[] args)
 {
    Time t1=new Time(1,12,4,0);
    Time t2=new Time(2,12,53,61);
   
    t1.add(t2);
    System.out.println("time is:");
    t1.display();
 }
}