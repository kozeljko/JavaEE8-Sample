package org.test.view;

import org.omnifaces.cdi.ViewScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created 11. 03. 22
 * @author Aljaž Koželj
 */
@Named
@ViewScoped
public class ViewBean implements Serializable {
    private static final Logger log = LoggerFactory.getLogger(ViewBean.class);
    private int count = 0;

    @PostConstruct
    public void init() {
        log.info("Opened view bean.");
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
