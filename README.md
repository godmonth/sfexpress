# sfexpress-bsp-sdk
sfexpress sdk
Sdk just began, it is under rapidly development.

Sdk require java 1.6+.

See src/test/java for samples, i have no enough time write document.

Sdk use apache httpclient and spring resttemplate. if you don't need it, just ignore them.the dependencies has already marked as optional.you can use only com.godmonth.sfexpress.bsp.protocol package,this is protocol definition.

Add snapshot repository in your settings.xml if you need snapshot version.

'<repository>
					<id>ossrh</id>
					<url>https://oss.sonatype.org/content/repositories/snapshots</url>
					<releases>
						<enabled>false</enabled>
					</releases>
					<snapshots>
						<enabled>true</enabled>
					</snapshots>
</repository>'




