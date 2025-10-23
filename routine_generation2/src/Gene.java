public class Gene {


        // Each Gene represents one class slot in the timetable
        private String subject;
        private String teacher;
        private String room;
        private String group;
        private boolean isLab;
        private int startSlot;
        private int duration;

        public Gene() {}


        public Gene(String subject, String teacher, String room, String group, boolean isLab, int startSlot, int duration) {
            this.subject = subject;
            this.teacher = teacher;
            this.room = room;
            this.group = group;
            this.isLab = isLab;
            this.startSlot = startSlot;
            this.duration = duration;
        }

        // Getters and Setters
        public String getSubject() { return subject; }
        public void setSubject(String subject) { this.subject = subject; }

        public String getTeacher() { return teacher; }
        public void setTeacher(String teacher) { this.teacher = teacher; }

        public String getRoom() { return room; }
        public void setRoom(String room) { this.room = room; }

        public String getGroup() { return group; }
        public void setGroup(String group) { this.group = group; }

        public boolean isLab() { return isLab; }
        public void setLab(boolean lab) { isLab = lab; }

        public int getStartSlot() { return startSlot; }
        public void setStartSlot(int startSlot) { this.startSlot = startSlot; }

        public int getDuration() { return duration; }
        public void setDuration(int duration) { this.duration = duration; }

        @Override
        public String toString() {
            return "Gene{" +
                    "subject='" + subject + '\'' +
                    ", teacher='" + teacher + '\'' +
                    ", room='" + room + '\'' +
                    ", group='" + group + '\'' +
                    ", isLab=" + isLab +
                    ", startSlot=" + startSlot +
                    ", duration=" + duration +
                    '}';
        }


}
