##Spring 实战（第5版）
### 0.0.1-SNAPSHOT
- 功能 home页面。
- 问题
静态文件放在static目录下会自动加载。
碰到的问题是static的子目录下images目录下图片不能被加载，找了很多方法指定静态目录方法来解决，最后又发现子目录也是能自动加载。
忘了最开始不能加载的原因。
### 0.0.2-SNAPSHOT
- 功能 design页面。
#### 问题
完全按照书上design.html所写的话访问页面会跑错：
```
Caused by: org.springframework.beans.NotReadablePropertyException: Invalid property 'name' of bean class [com.camel.tacos.Taco]: Bean property 'name' is not readable or has an invalid getter method
```
看抛错可以明白html页面的输入绑定了Taco类的name字段，请求发往Controller会调用Taco的getName方法，需要添加该方法。