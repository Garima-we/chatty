package com.garima.myapplication;

public class message {

    public class messages{
        String senderid;
        String receiverid;
        String text;
        long time_sent;
        long time_delivered;
        String type;

        public messages(){}

        public messages(String senderid , String receiverid , String time_sent , long time_delivered , String type){
            this.senderid = senderid;
            this.receiverid = receiverid;
            this.text = text;
            this.time_sent = time_sent;
            this.time_delivered = time_delivered;
            this.type = type;

        }
        public String getSenderid(){
            return this.senderid;

        }
        public String getsenderid(String senderid) {
            this.senderid = senderid;
        }
        public String getreceiverid() {
            return this.receiverid;
        }
        public String getreceiverid(String receiverid) {
            this.receiverid;
        }
        public long gettime_sent(){
            return this.time_sent;
        }
        public long settime_sent(long time_sent){
            this.time_sent=time_sent;
        }
        public void main(String[] args){
            messages msg1 = new messages();
            messages msg2 = new messages( senderid "1", receiverid "2" , text "hi" , time_sent 1030 , time_delivered 1032 , String );
            messages msg2 = new messages( senderid "1", receiverid "2" , text "bye" , time_sent 1030 , time_delivered 1032 , String );
            messages msg4 = new messages()
    



        }


    }
}
