package pos.presentation.cajero;

import pos.Application;
import pos.logic.Cajero;
import pos.presentation.AbstractModel;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Model extends AbstractModel{
    //====== Atributos ======\\
    Cajero filter;
    List<Cajero> list;
    Cajero current;
    int mode;

    //=======================\\

    //@Override
    public void addPropertyChangeListener(PropertyChangeListener listener){
        super.addPropertyChangeListener(listener);
        firePropertyChange(LIST);
        firePropertyChange(CURRENT);
        firePropertyChange(FILTER);
    }

    public Model(){

    }

    public void init(){
        this.list = list;
        this.filter = new Cajero();
        this.current = filter;
        this.mode = Application.MODE_CREATE;
    }

    public List<Cajero> getList(){
        return list;
    }

    public void setList(List<Cajero> list){
        this.list = list;
        firePropertyChange(LIST);
    }

    public Cajero getCurrent(){ return this.current; }
    public void setCurrent(Cajero current){
        this.current = current;
        firePropertyChange(CURRENT);
    }

    public Cajero getFilter(){ return this.filter; }
    public void setFilter(Cajero filter){
        this.filter = filter;
        firePropertyChange(FILTER);
    }

    public int getMode(){ return this.mode; }
    public void setMode(int mode){
        this.mode = mode;
    }


    public static final String LIST="list";
    public static final String CURRENT="current";
    public static final String FILTER="filter";
}
