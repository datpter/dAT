package com.class4;

public class MyData  {
    public int day , month , year ,m ;
    public MyData (int day ,int month , int year,int m){
        if (day>=1 && day <= 31){
            this.day=day;
        }else {
            this.day =2;
        }
        if (month >=1 && month <= 12){
            this.month = month;
        }else {
            this.month=2;
        }
        if(year > 0){
            this.year=year;
        }else {
            this.year=2;
        }
        if(m>1&&m<4){
            this.m=m;
        } else {
            this.m=2;
        }
    }
   // public int getDay(){
       // return this.day;
  //  }
   // public void setDay(int d){
      //  if(d>=1 && d<= 31)
      //      this.day=d;
    //}
   // public  int getMonth(){
    //    return this.month;
   // }
   // public  void setMonth(int month){
      //  if(month >= 1 && month<=12){
        //   this.year=month;
        //}
    public String toString(){
        return this.day+ "/"+this.month+"/"+this.year;
    }
    }

//}

