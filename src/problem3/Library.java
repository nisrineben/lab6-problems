package problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    ArrayList<Document> documents;
    Library(int capacity){
        this.capacity=capacity;
    }
    void displayDocument(){
        for(Document doc:documents){
            System.out.println(doc.toString());
        }
    }
    private boolean find(Document doc){
        for(Document d:documents){
            if(d==doc)return true;
        }
        return false;
    }
    boolean add(Document doc){
        if(!find(doc)){
            documents.add(doc);
            return true;
        }
        return false;
    }
    boolean delete(Document doc){
        if(!find(doc)){
            documents.remove(doc);
            return true;
        }
        return false;
    }
    Document document(int numEnrg){
        return Document(numEnrg)
    }
    void displayAuthor(){}
}
