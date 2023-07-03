package com.example.mvvm.Dao;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/example/mvvm/Dao/NameDao;", "", "delete", "", "insert", "Lcom/example/mvvm/DataEntity/Data;", "app_debug"})
@androidx.room.Dao
public abstract interface NameDao {
    
    @androidx.room.Insert(onConflict = 5)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.example.mvvm.DataEntity.Data insert);
    
    @androidx.room.Query(value = "DELETE FROM name_table")
    public abstract void delete();
}