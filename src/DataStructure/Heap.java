package DataStructure;
import javax.sound.midi.MidiDevice;
import java.util.ArrayList;
import java.util.Collections;

public class Heap {
    public ArrayList<Integer> heapArray = null;

    public Heap(Integer data){
        heapArray = new ArrayList<>();

        heapArray.add(null);
        heapArray.add(data);
    }

    public boolean move_up(Integer inserted_idx){
        if(inserted_idx <= 1){
            return false;
        }
        Integer parent_idx = inserted_idx / 2;
        if(this.heapArray.get(inserted_idx) > this.heapArray.get(parent_idx)){
            return true;
        }else{
            return false;
        }
    }

    public boolean insert(Integer data){
        Integer inserted_idx, parent_idx;

        if(heapArray==null){
            heapArray = new ArrayList<>();
            heapArray.add(null);
            heapArray.add(data);
            return true;

        }
        this.heapArray.add(data);
        inserted_idx = this.heapArray.size()-1;

        while(this.move_up(inserted_idx)){
            parent_idx = inserted_idx / 2;
            Collections.swap(this.heapArray,inserted_idx,parent_idx);
            inserted_idx= parent_idx;
        }
        return true;
    }

    public Integer pop(){
        Integer returned_data, popped_idx, left_child_popped_idx,right_child_popped_idx;
        if(this.heapArray==null){
            return null;
        }else{
            returned_data = this.heapArray.get(1);
            this.heapArray.set(1,this.heapArray.get(this.heapArray.size()-1));
            this.heapArray.remove(this.heapArray.size()-1);
            popped_idx = 1;

            while (this.move_down(popped_idx)){
                left_child_popped_idx = popped_idx * 2;
                right_child_popped_idx = popped_idx * 2 + 1;

                if(right_child_popped_idx >= this.heapArray.size()){
                    if (this.heapArray.get(popped_idx)<this.heapArray.get(left_child_popped_idx)){
                        Collections.swap(heapArray,popped_idx,left_child_popped_idx);
                        popped_idx = left_child_popped_idx;
                    }
                }else{
                    if(this.heapArray.get(left_child_popped_idx) > this.heapArray.get(right_child_popped_idx)){
                        if(this.heapArray.get(popped_idx) < this.heapArray.get(left_child_popped_idx)){
                            Collections.swap(heapArray, popped_idx,left_child_popped_idx);
                            popped_idx = left_child_popped_idx;
                        }
                    }else{
                        if(this.heapArray.get(popped_idx) < this.heapArray.get(right_child_popped_idx)){
                            Collections.swap(heapArray,popped_idx,right_child_popped_idx);
                            popped_idx = right_child_popped_idx;
                        }

                    }
                }
            }


            return returned_data;
        }
    }

    public boolean move_down(Integer popped_idx){
        Integer left_child_popped_idx, right_child_popped_idx;
        left_child_popped_idx = popped_idx * 2;
        right_child_popped_idx = popped_idx * 2 +1;

        if(left_child_popped_idx >= this.heapArray.size()){
            return false;
        }else if (right_child_popped_idx >= this.heapArray.size()){
            if(this.heapArray.get(popped_idx)<this.heapArray.get(left_child_popped_idx)){
                return true;
            }else{
                return false;
            }

        }else{
            if(this.heapArray.get(left_child_popped_idx)>this.heapArray.get(right_child_popped_idx)){
                if(this.heapArray.get(popped_idx)<this.heapArray.get(left_child_popped_idx)){
                    return true;
                }else{
                    return false;
                }
            }else{
                if(this.heapArray.get(popped_idx)<this.heapArray.get(right_child_popped_idx)){
                    return true;
                }else{
                    return false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap(15);
        heap.insert(10);
        heap.insert(8);
        heap.insert(5);
        heap.insert(4);
        heap.insert(20);
        heap.insert(30);
        System.out.println(heap.heapArray);
        heap.pop();
        System.out.println(heap.heapArray);
        heap.pop();
        System.out.println(heap.heapArray);
    }
}
