#  StyledDialogs for Android

自定义dialog

 ![hello](img/csdialog-show.png)

## How to create dialogs

Easy:

```java
/**
 * 1：progress dialog
 */
CSProgressDialog csDialog = new CSProgressDialog(this);
csDialog.setCancelable(true);//物理返回键是否关闭
csDialog.show();
csDialog.dismiss();
```

```java
/**
 * 2：带有一个按钮的dialog
 */
CSOKDialog.createBuilder(this).setMsg("这是一条信息").show();
```

```java
/**
 * 3:两个按钮的diallog
 */
final CSOKCancelDialog okCancelDialog = CSOKCancelDialog.createBuilder(this).setMsg("这是一条信息");
okCancelDialog.setOKOnClickListener(new OnClickListener() {
    
    @Override
    public void onClick(View view) {
        okCancelDialog.dismiss();
        //TODO...
    }
});
okCancelDialog.show();
```


