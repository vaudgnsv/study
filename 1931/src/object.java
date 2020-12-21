class object implements Comparable<object>{


    private long start;
    private long end;
    private long period;

    public object(long start, long end) {
        this.start = start;
        this.end = end;
        this.period = end - start;
    }

    public long getEnd() {
        return end;
    }

    public long getPeriod() {
        return period;
    }

    public long getStart() {
        return start;
    }

    public String print() {
        return "start:" + start + ", end:" + end + ", period:" + period;
    }

    @Override
    public int compareTo(object o) {

        if(this.end < o.end) {
            return -1;
        }
        else if(this.end == o.end) {
            return 0;
        }
        else {
            return 1;
        }


    }
}
