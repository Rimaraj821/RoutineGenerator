package scheduler;

public class StudentGroup {
    public int id;
    public String name;
    public String[] subject = new String[10];
    public int nosubject;
    public int[] teacherid = new int[10];
    public int[] hours = new int[10];

    public StudentGroup() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSubject() {
        return this.subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    public int getNosubject() {
        return this.nosubject;
    }

    public void setNosubject(String snosubject) {
        int nosubject = Integer.parseInt(snosubject);
        this.nosubject = nosubject;
    }

    public int[] getTeacherid() {
        return this.teacherid;
    }

    public void setTeacherid(int[] teacherid) {
        this.teacherid = teacherid;
    }

    public int[] getHours() {
        return this.hours;
    }

    public void setHours(int[] hours) {
        this.hours = hours;
    }
}
