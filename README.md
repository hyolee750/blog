# blog
a blog website that i want to complete in 2016,hope it can be done

快捷键介绍
    Ctrl + F	在当前文件进行文本查找 （必备）
    Ctrl + R	在当前文件进行文本替换 （必备）
    Ctrl + Z	撤销 （必备）
    Ctrl + Y	删除光标所在行 或 删除选中的行 （必备）
    Ctrl + X	剪切光标所在行 或 剪切选择内容
    Ctrl + C	复制光标所在行 或 复制选择内容
    Ctrl + D	复制光标所在行 或 复制选择内容，并把复制内容插入光标位置下面 （必备）
    Ctrl + W	递进式选择代码块。可选中光标所在的单词或段落，连续按会在原有选中的基础上再扩展选中范围 （必备）
    Ctrl + E	显示最近打开的文件记录列表
    Ctrl + N	根据输入的 类名 查找类文件
    Ctrl + G	在当前文件跳转到指定行处
    Ctrl + J	插入自定义动态代码模板
    Ctrl + P	方法参数提示显示
    Ctrl + Q	光标所在的变量 / 类名 / 方法名等上面（也可以在提示补充的时候按），显示文档内容
    Ctrl + U	前往当前光标所在的方法的父类的方法 / 接口定义
    Ctrl + B	进入光标所在的方法/变量的接口或是定义出，等效于 Ctrl + 左键单击
    Ctrl + H	显示当前类的层次结构
    Ctrl + O	选择可重写的方法
    Ctrl + I	选择可继承的方法
    Ctrl + +	展开代码
    Ctrl + -	折叠代码
    Ctrl + /	注释光标所在行代码，会根据当前不同文件类型使用不同的注释符号 （必备）
    Ctrl + [	移动光标到当前所在代码的花括号开始位置
    Ctrl + ]	移动光标到当前所在代码的花括号结束位置
    Ctrl + F1	在光标所在的错误代码处显示错误信息
    Ctrl + F3	调转到所选中的词的下一个引用位置
    Ctrl + End	跳到文件尾
    Ctrl + Alt + L	格式化代码，可以对当前文件和整个包目录使用 （必备）
    Ctrl + Alt + O	优化导入的类，可以对当前文件和整个包目录使用 （必备）
    Ctrl + Alt + Enter	光标所在行上空出一行，光标定位到新行
    Ctrl + Alt + 左方向键	退回到上一个操作的地方 （必备）
    Ctrl + Alt + 右方向键	前进到下一个操作的地方 （必备）
    Ctrl + Shift + F	根据输入内容查找整个项目 或 指定目录内文件 （必备）
    Ctrl + Shift + R	根据输入内容替换对应内容，范围为整个项目 或 指定目录内文件 （必备）
    Ctrl + Shift + J	自动将下一行合并到当前行末尾 （必备）
    Ctrl + Shift + Z	取消撤销 （必备）
    Ctrl + Shift + U	对选中的代码进行大 / 小写轮流转换 （必备）
    Ctrl + Shift + Enter	自动结束代码，行末自动添加分号 （必备）

刚刚没提交上去，重新测试一下
2016年5月22日 星期日
1.今日完成的目标，
    框架 springmvc+spring+mybatis
    构建工具 maven
    开发工具 itellij idea14
    版本管理工具 git
 2.解决问题
定要记住，src/main/java下的配置文件在编译的时候是默认不加载的
          因为Mybatis的Mapper映射文件在src/main/java下。所以不会加载，于是报错了
          org.apache.ibatis.binding.BindingException: Invalid bound statement (not found):
          碰到上面的问题，记住增加下面的资源配置属性
   <resources>
      <resource>
          <directory>src/main/java</directory>
          <includes>
              <include>**/*.xml</include>
              <include>**/*.properties</include>
          </includes>
      </resource>
      <resource>
          <directory>src/main/resources</directory>
          <includes>
              <include>**/*.xml</include>
              <include>**/*.properties</include>
          </includes>
      </resource>
  </resources>