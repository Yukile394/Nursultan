package minecraft;

import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.PathMatcher;

@FunctionalInterface
public interface class04186 {
   class04186 N = FileSystem::getPathMatcher;
   class04186 y = (var0, var1) -> var1x -> var1x.toString().startsWith(var1);

   PathMatcher compile(FileSystem var1, String var2);
}
