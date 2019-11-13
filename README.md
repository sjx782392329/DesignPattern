**大话设计模式 Java 实现**
***模式一 ：简单工厂模式***  

使用了 面向对象 的思想  

封装了计算器的属性  

通过继承解耦类之间的关系  

使用多态实现不同的计算法则统一化  

OperationAdd
OperationSub    都继承自 Operation    通过 OperationFactory 生产 Operation 对象，父类引用指向子类对象，调用各自子类的方法 
OperationMul
OperationDiv    
