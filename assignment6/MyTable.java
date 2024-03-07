package assignment6;
public class MyTable {

    private Entry[] entries = new Entry[26];

    public String get(char c){
        int index = c - 'a';
        if (entries[index] != null) {
            return entries[index].str;
        } else {
            return null; //entry is not found
        }
    }
    public void add(char c, String s){
        int index = c - 'a';
        entries[index] = new Entry(c, s);
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for (Entry entry : entries) {
            if (entry != null) {
                result.append(entry.toString()).append("\n");
            }
        }
        return result.toString();
    }
    private class Entry{
        char ch;
        String str;
        Entry(char c, String s){
            ch = c;
            str = s;
        }
        // returns String of the form "ch->str"
        @Override
        public String toString(){
            return ch + "->"+ str;
        }
    }
    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b', "Billy");
        t.add('c', "Charlie");

        // MyTable entries
        System.out.println(t);

        String s = t.get('b');
        System.out.println(s);
    }
}
