package com.bairanalytics.support;

import com.bairanalytics.entities.AgencyEntity;
import java.util.*;


/**
 * Created by Sean on 9/10/2015.
 */

public class TestAgencyList {

    public static void main(String args[]) {

        AgencyEntity entity = new AgencyEntity();

        //JFrame frame = new JFrame("Agency Tag List");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArrayList tagList = new ArrayList();
        //tagList.setModel(new DefaultListModel());

        for(int i=1;i<500;i++) {
            tagList.add(entity.displayAgencyTag());
        }

        System.out.println(tagList);

//        DefaultListModel model = (DefaultListModel)tagList.getModel();
//

//
//
//        Container contentPane = frame.getContentPane();
//        contentPane.add(tagList, BorderLayout.CENTER);
//
//        frame.setSize(200, 200);
//        frame.setVisible(true);
    }

}

