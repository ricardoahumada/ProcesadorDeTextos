package com.banana.persistence;

import com.banana.models.Texto;

import java.util.ArrayList;
import java.util.List;

public class TextosEnMemoria {
    private List<Texto> textos= new ArrayList();

    public TextosEnMemoria() {
        this.textos.add(new Texto("Hola mundo!"));
        this.textos.add(new Texto("esto es un texto"));
        this.textos.add(new Texto("Esto es un título"));
        this.textos.add(new Texto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas tortor dui, pretium vestibulum risus eget, fringilla cursus felis. Sed nibh erat, ultrices eget sem at, auctor posuere dolor. Aenean dignissim malesuada lacinia. Duis imperdiet odio finibus massa suscipit, eget hendrerit nulla facilisis. Nunc id neque eget leo pellentesque facilisis. Vivamus id erat iaculis, ornare sem at, pretium ligula. Sed scelerisque dignissim justo id euismod. Vivamus mattis in enim eu interdum."));
    }

    public Texto get(int idx) {
        if(idx>=0 && idx<this.textos.size()) return this.textos.get(idx);
        else return null;
    }

    public List<Texto> geAll() {
        return this.textos;
    }

    public int getSize(){
        return this.textos.size();
    }
}
