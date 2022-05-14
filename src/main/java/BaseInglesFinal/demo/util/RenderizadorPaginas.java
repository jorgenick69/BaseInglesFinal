/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.util;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

/**
 *
 * @author jorge
 */


public class RenderizadorPaginas <T>{
    
    private String url;
    private Page<T> page;
    private int totalPage;
    private int nElemPorPage;
    private int actualPage;
    private List<ElementosPagina> paginas;

    public RenderizadorPaginas(String url, Page<T> page) {
        this.url = url;
        this.page = page;
        this.paginas=new ArrayList<ElementosPagina>();
        totalPage=page.getTotalPages();
        nElemPorPage=page.getSize();
        actualPage=page.getNumber()+1;
        int desde,hasta;
       desde=1;
       hasta=totalPage;
        for (int i = 0; i < hasta; i++) {
            paginas.add(new ElementosPagina(desde + 1, actualPage==desde+i));
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getActualPage() {
        return actualPage;
    }

    public void setActualPage(int actualPage) {
        this.actualPage = actualPage;
    }
    
    
    
    
}
