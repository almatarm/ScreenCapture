package com.mycompany.screencapture;

import java.util.ArrayList;

/**
 * Created by almatarm on 30/10/2019.
 */
public class Books {
    public static ArrayList<String> names = new ArrayList<>();

    static {
//        names.add("Beginner Calisthenics");
        names.add("Circadian");
        names.add("Circadian Rhythms and the Human");
        names.add("Craft Coffee - Jessica Easto and Andreas Willhoff");
        names.add("Eat Dirt");
        names.add("Exercise Medicine Physiological Principles and Clinical Applications");
        names.add("Exercise Samples");
//        names.add("Frank Lloyd Wright and Mason City - Roy R. Behrens");
        names.add("How To Win Friends and Influence People");
        names.add("How to Talk so Little Kids Will Listen");
//        names.add("Intuitive Eating - 30 Intuitive Eating Tips");
        names.add("Intuitive Eating A Revolutionary Program that Works");
        names.add("Intuitive Eating, 2nd Edition: A Revolutionary Program That Works");
        names.add("Mold-Mycotoxins-Current-Evaluation-and-Treatment-2016");
        names.add("Own the Day, Own Your Life");
        names.add("Paleo Workouts For Dummies");
        names.add("Photovoltaic Design and Installation For Dummies");
        names.add("Requiem for a Dream");
        names.add("She - A History of Adventure");
        names.add("Song of Kali");
        names.add("Summary of 7 Lessons from Heaven");
        names.add("Summary of Algorithms to Live By");
        names.add("Summary of Dr. Gundry's Diet Evolution");
        names.add("Summary of The Power of Habit");
        names.add("Summary of Why We Sleep");
//        names.add("The Elements of Style");
        names.add("The Good Earth");
        names.add("The Power of Posture");
        names.add("The Social Animal");
        names.add("The World As I See It");
        names.add("Why We Sleep");
        names.add("Yoga Assists");
        names.add("The Autoimmune Solution | Amy Myers");
        names.add("Rosemary Gladstar's Medicinal Herbs | Rosemary Gladstar");
        names.add("Reiki for Beginners | David Vennells");
        names.add("Dysautonomia, POTS Syndrome | Frederick Earlstein");
        names.add("Elements of Style - Designing a Home & a Life | Erin Gates");
        names.add("Summary and Analysis of Thinking, Fast and Slow | Worth Books");
        names.add("Summary and Analysis of Guns, Germs, and Steel | Jared Diamond");
        names.add("Snapshot of Eat Move Sleep - How Small Choices Lead to Big Changes | Scribd");
        names.add("Mastering Qt 5 | Guillaume Lazar and Robin Penea");
        names.add("Street Spanish 3 - The Best of Naughty Spanish | David Burke");
        names.add("Spanish - General Knowledge Workout #1 | Sam Fuentes");
        names.add("A1 Bundle - Spanish Novels for Beginners | Paco Ardit");
        names.add("A2 Bundle - Spanish Novels for Beginners | Paco Ardit");
        names.add("B1 Bundle - Spanish Novels for Beginners | Paco Ardit");
        names.add("B2 Bundle - Spanish Novels for Beginners | Paco Ardit");
        names.add("C1 Bundle - Spanish Novels for Beginners | Paco Ardit");
        names.add("C2 Bundle - Spanish Novels for Beginners | Paco Ardit");
        names.add("Qt5 C++ GUI Programming Cookbook | Eng Lee Zhi");
    }

    public static ArrayList<String> getNames() {
        return names;
    }

    public static String getLastName() {
        return names.get(names.size() -1);
    }
}
