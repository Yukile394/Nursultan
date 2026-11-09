package minecraft;

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class class01068 implements class01089, AutoCloseable {
   private static final Logger N = LogUtils.getLogger();
   private class03554 y;
   private final List<class01081> u = Lists.newArrayList();
   private final class01603 i;

   @Override
   public Map<class01894, List<class01079>> L(String var1, Predicate<class01894> var2) {
      return this.y.L(var1, var2);
   }

   public class01068(class01603 var1) {
      super();
      this.i = var1;
      this.y = new class03545(var1, List.of());
   }

   @Override
   public void close() {
      this.y.close();
   }

   @Override
   public Stream<class01622> y() {
      return this.y.y();
   }

   @Override
   public Map<class01894, class01079> y(String var1, Predicate<class01894> var2) {
      return this.y.y(var1, var2);
   }

   @Override
   public List<class01079> N(class01894 var1) {
      return this.y.N(var1);
   }

   @Override
   public Set<String> N() {
      return this.y.N();
   }

   public void N(class01081 var1) {
      this.u.add(var1);
   }

   public class06164 N(Executor var1, Executor var2, CompletableFuture<class06244> var3, List<class01622> var4) {
      N.info("Reloading ResourceManager: {}", LogUtils.defer(() -> var4.stream().map(class01622::method_14409).collect(Collectors.joining(", "))));
      this.y.close();
      this.y = new class03545(this.i, var4);
      return class06162.N(this.y, this.u, var1, var2, var3, N.isDebugEnabled());
   }

   @Override
   public Optional<class01079> method_14486(class01894 var1) {
      return this.y.method_14486(var1);
   }
}
