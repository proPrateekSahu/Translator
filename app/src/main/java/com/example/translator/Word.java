package com.example.translator;

public class Word  {
    private String mDefaultTranslation;
    private String        mHindiTranslation;
    private int mResourceId = NO_IMAGE_PROVIDED;
    public static final int NO_IMAGE_PROVIDED = -1;
    private  int mAudioResourceId;


    public Word(String defaultTranslation,String  hindiTranslation,int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mHindiTranslation = hindiTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation ,String hindiTranslation,int resourceId ,int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mHindiTranslation = hindiTranslation;
        mResourceId = resourceId;
        mAudioResourceId= audioResourceId;
    }


    public String     getDefaultTranslation(){
        return  mDefaultTranslation;
    }

    public  String   getHindiTranslation(){
        return  mHindiTranslation;
    }

    public int getImageResourceId(){ return mResourceId;}

    public boolean hasImage(){ return mResourceId != NO_IMAGE_PROVIDED ;}

    public int getAudioResourceId() { return mAudioResourceId; }
}
