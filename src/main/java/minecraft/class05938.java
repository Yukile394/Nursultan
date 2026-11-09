package minecraft;

import com.google.common.collect.Lists;
import java.util.List;

public class class05938 implements class05971 {
   private static final class00392 N = class00392.L("spectatorMenu.root.prompt");
   private final List<class01262> y = Lists.newArrayList();

   public class05938() {
      super();
      this.y.add(new class01264());
      this.y.add(new class01267());
   }

   @Override
   public class00392 y() {
      return N;
   }

   @Override
   public List<class01262> N() {
      return this.y;
   }
}
