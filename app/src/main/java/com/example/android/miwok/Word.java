package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation, mDefaultTranslation;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImgResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    public Word(String miwokTranslation, String defaultTranslation, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imgResourceId, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImgResourceId = imgResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImgResourceId() {
        return mImgResourceId;
    }

    public boolean hasImage() {
        return mImgResourceId != NO_IMAGE_PROVIDED;
    }

    public int getaudioResourceId() {
        return mAudioResourceId;
    }
}
