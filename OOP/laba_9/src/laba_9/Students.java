package laba_9;

class Students {
    String name, adress, facultet;
    int kurs;
    int []marks;
    Students(String name, String adress, String facultet, int kurs, int []marks){
        this.name = name;
        this.adress = adress;
        this.facultet = facultet;
        this.kurs = kurs;
        this.marks = marks;        
    }
    String getName() {return name;}
    String getAdress() {return adress;}
    String getFacultet() {return facultet;}
    int getKurs() {return kurs;}
    int[] getMarks() {return marks;}
    
    void setName(String name) {this.name = name;}
    void setAdress(String adress) {this.adress = adress;}
    void setFacultet(String facultet) {this.facultet = facultet;}
    void setKurs(int kurs) {this.kurs = kurs;}
    void setMarks(int []marks) {this.marks = marks;}
    
    double sr(){
        double s;
        s = 0;
        for(int i = 0;i<marks.length;i++){
            s += marks[i];
        }
        return s/marks.length;
    }
    public String toString(){
        String s = " ";
        for(int i =0;i<marks.length;i++){
            s += String.valueOf(marks[i]);
            s+=" ";
        }
        return "Name: " + name + "\n Adress: " + adress + "\n Facultet: " + facultet + "\n Kurs: " + kurs + "\n Marks" + s;
    }
}