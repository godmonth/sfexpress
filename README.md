# sfexpress-bsp-sdk
sfexpress sdk
Sdk just began, it is under rapidly development.

Sdk require java 1.6+.

See src/test/java for samples, i have no enough time write document.

Sdk use apache httpclient and spring resttemplate. if you don't need it, just ignore them.the dependencies has already marked as optional.you can use only com.godmonth.sfexpress.bsp.protocol package,this is protocol definition.

maven dependency

&lt;dependency&gt;<br/>&nbsp;&nbsp;&nbsp;&nbsp;&lt;groupId&gt;com.godmonth&lt;/groupId&gt;<br/>&nbsp;&nbsp;&nbsp;&nbsp;&lt;artifactId&gt;sfexpress-bsp-sdk&lt;/artifactId&gt;<br/>&nbsp;&nbsp;&nbsp;&nbsp;&lt;version&gt;0.1-SNAPSHOT&lt;/version&gt;<br/>&lt;/dependency&gt;

Add snapshot repository in your settings.xml if you need snapshot version.

&lt;repository&gt;<br/>&nbsp;&nbsp;&nbsp;&nbsp;&lt;id&gt;ossrh&lt;/id&gt;<br/>&nbsp;&nbsp;&nbsp;&nbsp;&lt;url&gt;https://oss.sonatype.org/content/repositories/snapshots&lt;/url&gt;<br/>&nbsp;&nbsp;&nbsp;&nbsp;&lt;releases&gt;<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;enabled&gt;false&lt;/enabled&gt;<br/>&nbsp;&nbsp;&nbsp;&nbsp;&lt;/releases&gt;<br/>&nbsp;&nbsp;&nbsp;&nbsp;&lt;snapshots&gt;<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;enabled&gt;true&lt;/enabled&gt;<br/>&nbsp;&nbsp;&nbsp;&nbsp;&lt;/snapshots&gt;<br/>&lt;/repository&gt;




