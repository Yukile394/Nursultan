package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.hash.HashCode;
import java.nio.file.Path;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

record class07097(String version, ConcurrentMap<Path, HashCode> data) {
   public ConcurrentMap<Path, HashCode> L() {
      return this.data;
   }

   class07097(String var1) {
      this(var1, new ConcurrentHashMap<>());
   }

   private class07097(String version, ConcurrentMap<Path, HashCode> data) {
      super();
      this.version = version;
      this.data = data;
   }

   public String y() {
      return this.version;
   }

   public class07096 N() {
      return new class07096(this.version, ImmutableMap.copyOf(this.data));
   }

   public void N(Path var1, HashCode var2) {
      this.data.put(var1, var2);
   }
}
