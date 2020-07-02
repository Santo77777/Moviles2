package com.example.fcomputers.conection;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class FirebaseConnection {

    private static FirebaseAuth mAuth;
    private FirebaseAuth mAuth;

    /*private static StorageReference mStorageRef;*/

    private static FirebaseFirestore db;

    private static FirebaseFirestore mFirebaseStorage;


    public static  FirebaseAuth ConnectionAuth(){
        return mAuth = FirebaseAuth.getInstance();

    }
/*
    public static StorageReference ConnectionStorage(){
        return mStorageRef = FirebaseStorage.getInstance().getReference();
    }
*/
    public static FirebaseFirestore ConnectionFirestore(){
        return db = FirebaseFirestore.getInstance();

    }

    public static  FirebaseFirestore ConnectionStorage(){
        return mFirebaseStorage=FirebaseFirestore.getInstance();
    }


}
