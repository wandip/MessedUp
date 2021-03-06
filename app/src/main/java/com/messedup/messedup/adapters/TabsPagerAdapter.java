package com.messedup.messedup.adapters;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.messedup.messedup.week_update_fragments.day0;
import com.messedup.messedup.week_update_fragments.day1;
import com.messedup.messedup.week_update_fragments.day2;
import com.messedup.messedup.week_update_fragments.day3;
import com.messedup.messedup.week_update_fragments.day4;
import com.messedup.messedup.week_update_fragments.day5;
import com.messedup.messedup.week_update_fragments.day6;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by tanmaysinghal98 on 18/08/17.
 */

public class TabsPagerAdapter extends FragmentPagerAdapter {
    ArrayList menuList;

    public TabsPagerAdapter(FragmentManager fm, ArrayList list) {
        super(fm);
        menuList = list;
//        Log.e("ewrre", menuList.toString());
    }

    @Override
    public Fragment getItem(int position) throws ArrayIndexOutOfBoundsException{


        try {
            switch (position) {
                case 0:

                    try{
                        if (menuList.size()>0&& menuList != null) {
                            ArrayList node0 = (ArrayList) menuList.get(0);
                            HashMap<String, ArrayList> m20 = (HashMap<String, ArrayList>) node0.get(1);

                            ArrayList m30 = m20.get("menu");

/*
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("valuesArray", m30);
                day0 myFragment = new day0();
                myFragment.setArguments(bundle);
                return myFragment;*/
                            return new day0(m30);
                        }
                        else
                        {
                            break;
                        }

                    }
                    catch (Exception e)
                    {

                        e.printStackTrace();
                        break;
                    }


                case 1:
                    try{
                        if (menuList.size()>1&& menuList != null) {

                            ArrayList node1 = (ArrayList) menuList.get(1);
                            HashMap<String, ArrayList> m21 = (HashMap<String, ArrayList>) node1.get(1);
                            ArrayList m31 = m21.get("menu");
                            return new day1(m31);
                        }
                        else
                        {
                            break;
                        }
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                        break;
                    }
                case 2:
                    try {
                        if (menuList.size() > 2 && menuList != null) {

                            ArrayList node2 = (ArrayList) menuList.get(2);
                            HashMap<String, ArrayList> m22 = (HashMap<String, ArrayList>) node2.get(1);
                            ArrayList m32 = m22.get("menu");
                            return new day2(m32);
                        }
                        else
                        {
                            break;
                        }
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                        break;
                    }
                case 3:
                    try {
                        if (menuList.size() > 3 && menuList != null) {

                            ArrayList node3 = (ArrayList) menuList.get(3);
                            HashMap<String, ArrayList> m23 = (HashMap<String, ArrayList>) node3.get(1);
                            ArrayList m33 = m23.get("menu");
                            return new day3(m33);
                        }
                        else
                        {
                            break;
                        }
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                        break;
                    }
                case 4:
                    try {
                        if (menuList.size() > 4 && menuList != null) {

                            ArrayList node4 = (ArrayList) menuList.get(4);
                            HashMap<String, ArrayList> m24 = (HashMap<String, ArrayList>) node4.get(1);
                            ArrayList m34 = m24.get("menu");
                            return new day4(m34);
                        }
                        else
                        {
                            break;
                        }
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                        break;
                    }
                case 5:
                    try {
                        if (menuList.size()>5&& menuList != null) {

                            ArrayList node5 = (ArrayList) menuList.get(5);
                            HashMap<String, ArrayList> m25 = (HashMap<String, ArrayList>) node5.get(1);
                            ArrayList m35 = m25.get("menu");
                            return new day5(m35);
                        }
                        else
                        {
                            break;
                        }
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                        break;
                    }
                case 6:
                    try {
                        if (menuList.size() > 6 && menuList != null) {

                            ArrayList node6 = (ArrayList) menuList.get(6);
                            HashMap<String, ArrayList> m26 = (HashMap<String, ArrayList>) node6.get(1);
                            ArrayList m36 = m26.get("menu");
                            return new day6(m36);
                        }
                        else
                        {
                            break;
                        }
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                        break;
                    }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public CharSequence getPageTitle(int position) throws ArrayIndexOutOfBoundsException{

        try {
            switch (position) {


                case 0:

                    try {

                        if (menuList.size()>0&& menuList != null) {

                            ArrayList node0 = (ArrayList) menuList.get(0);
                            HashMap<String, String> info0 = (HashMap<String, String>) node0.get(0);
                            String day0 = info0.get("day");
                            String date0 = info0.get("date");
                            return day0 + "  " + date0;
                        }
                        else
                        {
                            break;
                        }
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                        break;
                    }
                case 1:
                    try {

                        if (menuList.size() > 1 && menuList != null) {

                            ArrayList node1 = (ArrayList) menuList.get(1);
                            HashMap<String, String> info = (HashMap<String, String>) node1.get(0);
                            String day1 = info.get("day");
                            String date1 = info.get("date");
                            return day1 + "  " + date1;
                        }
                        else
                        {
                            break;
                        }
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                        break;
                    }
                case 2:

                    try {
                        if (menuList.size() > 2 && menuList != null) {

                            ArrayList node2 = (ArrayList) menuList.get(2);
                            HashMap<String, String> info2 = (HashMap<String, String>) node2.get(0);
                            String day2 = info2.get("day");
                            String date2 = info2.get("date");
                            return day2 + "  " + date2;
                        }
                        else
                        {
                            break;
                        }
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                        break;
                    }
                case 3:

                    try {

                        if (menuList.size() > 3 && menuList != null) {

                            ArrayList node3 = (ArrayList) menuList.get(3);
                            HashMap<String, String> info3 = (HashMap<String, String>) node3.get(0);
                            String day3 = info3.get("day");
                            String date3 = info3.get("date");
                            return day3 + "  " + date3;
                        }
                        else
                        {
                            break;
                        }
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                        break;
                    }
                case 4:

                    try{
                        if (menuList.size()>4&& menuList != null) {

                            ArrayList node4 = (ArrayList) menuList.get(4);
                            HashMap<String, String> info4 = (HashMap<String, String>) node4.get(0);
                            String day4 = info4.get("day");
                            String date4 = info4.get("date");
                            return day4 + "  " + date4;
                        }
                        else
                        {
                            break;
                        }
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                        break;
                    }
                case 5:

                    try {

                        if (menuList.size() > 5 && menuList != null) {

                            ArrayList node5 = (ArrayList) menuList.get(5);
                            HashMap<String, String> info5 = (HashMap<String, String>) node5.get(0);
                            String day5 = info5.get("day");
                            String date5 = info5.get("date");
                            return day5 + "  " + date5;
                        }
                        else
                        {
                            break;
                        }
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                        break;
                    }
                case 6:
                    try {
                        if (menuList.size() > 6 && menuList != null) {

                            ArrayList node6 = (ArrayList) menuList.get(6);
                            HashMap<String, String> info6 = (HashMap<String, String>) node6.get(0);
                            String day6 = info6.get("day");
                            String date6 = info6.get("date");
                            return day6 + "  " + date6;
                        }
                        else
                        {
                            break;
                        }
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                        break;
                    }
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 7;
    }
}
