一个整合了spring-boot和spring-cloud的demo。

整个demo分成两块，一个是business，包含了简单的业务模块。一个是component,包含了诸如eureka server、config server等组件。

业务模拟一个简单的书店管理系统，包含了图书查询、下订单的功能。
业务模块分为：
* 图书服务：提供图书查询功能
* 日志服务：提供日志记录，分成同步日志记录以及异步日志记录。
* 订单服务：提供下单功能，包含查询图书信息

以上业务处理只做日志打印，不做任何的数据库记录。

###### 业务1
* 订单服务向图书服务查询某本图书的库存信息。
涉及到的spring-cloud下eureka以及ribbon





参考书籍：Spring Cloud微服务实战

博客记录：[解读Spring Cloud全家桶之Eureka](http://nero.life/2019/01/28/%E8%A7%A3%E8%AF%BBSpring-Cloud%E5%85%A8%E5%AE%B6%E6%A1%B6%E4%B9%8BEureka/)

关于博客记录的现在只整理出了一篇eureka，后续得空会慢慢整理出涉及到的其他部分。