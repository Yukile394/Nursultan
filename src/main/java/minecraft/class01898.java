package minecraft;

import com.mojang.datafixers.util.Pair;
import java.util.List;

public record class01898(class01623 packRepository, class03776 initialDataConfig, boolean safeMode, boolean initMode) {
   public class03776 L() {
      return this.initialDataConfig;
   }

   public class01898(class01623 packRepository, class03776 initialDataConfig, boolean safeMode, boolean initMode) {
      this.packRepository = packRepository;
      this.initialDataConfig = initialDataConfig;
      this.safeMode = safeMode;
      this.initMode = initMode;
   }

   public boolean i() {
      return this.initMode;
   }

   public boolean u() {
      return this.safeMode;
   }

   public class01623 y() {
      return this.packRepository;
   }

   public Pair<class03776, class03554> N() {
      class03776 class03776 = class02796.N(this.packRepository, this.initialDataConfig, this.initMode, this.safeMode);
      List<class01622> list = this.packRepository.B();
      class03545 class03545 = new class03545(class01603.field_14190, list);
      return Pair.of(class03776, class03545);
   }
}
