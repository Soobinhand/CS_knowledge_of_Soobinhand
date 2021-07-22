package DataStructure;

public class Hashtable {

    public Slot[] hashTable;

    public Hashtable(Integer size){
        this.hashTable = new Slot[size];
    }

    public static class Slot{
        String key;
        String value;
        Slot next;
        Slot(String key, String value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public Integer hashFunction(String key){
        return (int)(key.charAt(0))%this.hashTable.length;
    }

    public boolean saveData(String key, String value){
        Integer address = this.hashFunction(key);
        if(this.hashTable[address]!=null){
            Slot findSlot = this.hashTable[address];
            Slot prevSlot = this.hashTable[address];
            while(findSlot!=null){
                if(findSlot.key==key){
                    findSlot.value=value;
                    return true;
                }else{
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }

            prevSlot.next = new Slot(key,value);
        }else{
            this.hashTable[address] = new Slot(key,value);
        }
        return true;
    }

    public String getData(String key){
        Integer address = this.hashFunction(key);
        if(this.hashTable[address]!=null){
            Slot findSlot = this.hashTable[address];
            while(findSlot!=null){
                if(findSlot.key == key){
                    return findSlot.value;
                }else{
                    findSlot = findSlot.next;
                }
            }
            return null;
        }else{
            return null;
        }
    }


    public static void main(String[] args) {
        Hashtable ht = new Hashtable(20);
        ht.saveData("soobinhand","1");
        ht.saveData("kim","2");
        ht.saveData("soo","3");
        ht.saveData("soove","4");
        ht.getData("soobinhand");
        System.out.println(ht.getData("soobinhand"));
        System.out.println(ht.getData("kim"));

    }



}
