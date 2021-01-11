package com.company.SCSSelfDiagnosis;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ListQuestion {
    private ArrayList<Ques> questionList;
    public ListQuestion(){
        questionList = new ArrayList<Ques>();
        String q1 = "Is this an emergency?:\n" +
                "Stop and call 911 if you are experiencing:\n" +
                "\t Severe, constant chest pain or pressure\n" +
                "\tExtreme difficulty breathing\n" +
                "\tSevere, constant lightheadedness\n" +
                "\tSerious disorientation or unresponsiveness\n" +
                "\tBlue-tinted face or lips";
        //1st option list
        String[] op1 = {"I'm experiencing at least one of these.","They do not have any of these"};
        //Add question and options to questionList array
        questionList.add(new Ques(q1,op1));

        String q2 = "How old are you?";
        String[] op2 = {"under 18","between 18 and 65","above 65"};
        questionList.add(new Ques(q2,op2));

        String q3 = "In the last 10 days, have they been tested for COVID-19?";
        String[] op3 = {"I was tested and their result was positive for COVID-19.",
        "I was tested and their result was negative for COVID 19.",
        "I was tested but they have not yet received their test results.",
        "I have not been tested in the last 10 days."};
        questionList.add(new Ques(q3,op3));

        String q4 = "Have you recently started experiencing any of these symptoms?";
        String[] op4 = {"Fever or chills",
                "Mild or moderate difficulty breathing",
                "New or worsening cough",
                "Suddenly loss of taste or smell",
                "Sore throat",
                "Vomiting or diarrhea",
                "Unexplained, significant fatigue or aching throughout the body",
                "None of the above"
        };
        questionList.add(new Ques(q4,op4));

        String q5 = "How severe are your symptoms?";
        String[] op5 = {"Symptoms have little to no impact\t I am able to do normal activities like exercising.",
        "Symptoms are having some impact\t I can only do some daily activities like cleaning and making food.",
        "Symptoms are having a major impact\t I can only do what's necessary such as using the bathroom or eating."
        };
        questionList.add(new Ques(q5,op5));

        String q6 = "Do any of these apply to you?";
        String[] op6 = {"Obesity",
                "Smoking or vaping",
                "Pregnancy",
                "Diabetes, high blood pressure, chronic kidney disease, or liver disease",
                "Chronic lung disease, such as moderate to severe asthma, COPD (chronic obstructive pulmonary disease), cystic fibrosis, or pulmonary fibrosis",
                "Serious heart condition, such as heart failure, prior heart attack, or cardiomyopathy",
                "Weakened immune system from HIV, cancer treatement, use of medicines causing immune suppression, or other factors",
                "Stroke dementia, or other cerebrovascular disease or neurologic condition",
                "Sickle cell disease, thalassemia, or other blood disorder",
                "None of the above"
        };
        questionList.add(new Ques(q6,op6));

        String q7 = "In the last 14 days, did any of these apply to you?";
        String[] op7 = {"I lived with someone who has COVID-19",
        "I cared for someone who has COVID-19",
        "For at least 15 minutes, I was within 1.82 meters (6 feet) of someone who has COVID-19",
        "I might have been exposed to COVID-19",
        "I've had no known exposure to COVID-19"
        };
        questionList.add(new Ques(q7,op7));

        String q8 = "In the last 14 days, did you work or volunteer in a health care facility?";
        String[] op8 = {"I worked or volunteered in a heathcare facility in the last 14 days",
        "I did not work or volunteer in a healthcare facility in the last 14 days"
        };

    }
    public void begin(){
        Scanner keyboardInput = new Scanner(System.in);
        ArrayList usrAnsList = new ArrayList<String>();
        //display question from questionList
        for (int question = 0; question < questionList.size(); question++){
            System.out.println("Question " + (question+1) + " :");
            System.out.println(questionList.get(question).getQuestion());
            //Number of options (depending on the question, the value varies from 2 -> 10.
            int numOps = questionList.get(question).getChoices().size();
            //display options from question in questionList
            for (int option = 0; option < numOps; option ++){
                System.out.println((option + 1) + ". " +
                        questionList.get(question).getChoices().get(option));
            }
            //User answer:
            int usrAns = keyboardInput.nextInt();
            //List of user answers.
            usrAnsList.add(questionList.get(question).getChoices().get(usrAns-1));
            if (question == 0 && usrAns == 1) {
                System.out.println("Contact the nearby hospital immediately.");
                break;
            }
            else if (question == 1 && usrAns == 1) {
                System.out.println("This tool is only intended for people who are at least 18 years old.");
                break;
            }

        }
        keyboardInput.close();
        System.out.println("End Self-Diagnose Test");
        System.out.println("Here are your options: ");
        for (int i = 1; i < usrAnsList.size(); i++){
            System.out.println("\t" + usrAnsList.get(i));
        }
    }
}
