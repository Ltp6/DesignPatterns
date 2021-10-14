# UML类图

- 目录：
[toc]

## 1、UML简介
- UML(Unified modeling language)(统一建模语言)，是一种用于软件系统分析和设计的语言工具，它用于帮助软件开发人员进行思考和记录思路的结果
- UML 本身是一套符号的规定，就像数学符号和化学符号一样，这些符号用于描述软件模型中的各个元素和他们之间的关系，比如类、接口、实现、泛化(继承)、依赖、组合、聚合等
![image](https://note.youdao.com/yws/public/resource/c937daeaf313c98c11747670907183cf/xmlnote/964DF087D4F449E28D8E62D2EBA5D153/29939)

## 2、类图关系


- 依赖关系（Dependence）
    - 只要是在类中用到了对方，那么他们之间就存在依赖关系。如果没有对方，连编绎都通过不了。
![依赖关系](https://note.youdao.com/yws/public/resource/c937daeaf313c98c11747670907183cf/xmlnote/FF6561B7B5DD4C9589C007D0FD2F2162/29972)

- 泛化关系(generalization）
    - 泛化关系实际上就是继承关系，他是依赖关系的特例

![泛化关系](https://note.youdao.com/yws/public/resource/c937daeaf313c98c11747670907183cf/xmlnote/337434DE6A344DB494927DC89EDE43FB/29969)

- 实现关系（Implementation）
    - 实现关系实际上就是A类实现B接口，他是依赖关系的特例

![实现关系](https://note.youdao.com/yws/public/resource/c937daeaf313c98c11747670907183cf/xmlnote/337434DE6A344DB494927DC89EDE43FB/29969)


- 关联关系（Association）
    - 关联关系实际上就是类与类之间的联系，他是依赖关系的特例
    - 关联具有导向性：即双向关系或单向关系。
- 聚合关系（Aggregation）
    - 表示的是整体和部分的关系，整体与部分可以分开。聚合关系是关联关系的特例，所以他具有关联的导航性与多重性。
![聚合关系](https://note.youdao.com/yws/public/resource/c937daeaf313c98c11747670907183cf/xmlnote/92674822A8DC49739304BDE8BFA13C5E/29963)
- 组合关系（Composition）
    - 也是整体与部分的关系，但是整体与部分不可以分开。
    - 如果在程序中Person实体中定义了对IDCard进行级联删除，即删除 Person 时连同 IDCard 一起删除，那么 IDCard  和 Person 就是组合了.
![组合关系](https://note.youdao.com/yws/public/resource/c937daeaf313c98c11747670907183cf/xmlnote/F6D39E17DFE344FBA44CF8662BBA54F4/29966)

