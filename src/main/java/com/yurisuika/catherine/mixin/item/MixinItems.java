package com.yurisuika.catherine.mixin.item;

import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(Items.class)
public class MixinItems {

    //AXOLOTL
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 16499171))
    private static final int axolotlPrimary(int primaryColor) {
        return 6787214;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 10890612))
    private static final int axolotlSecondary(int secondaryColor) {
        return 12811131;
    }

    // BAT
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 4996656))
    private static final int batPrimary(int primaryColor) {
        return 7628629;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 986895))
    private static final int batSecondary(int secondaryColor) {
        return 3881011;
    }

    // BEE
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 15582019))
    private static final int beePrimary(int primaryColor) {
        return 13414486;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 4400155))
    private static final int beeSecondary(int secondaryColor) {
        return 4929586;
    }

    // BLAZE
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 16167425, ordinal = 0))
    private static final int blazePrimary(int primaryColor) {
        return 11835751;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 16775294))
    private static final int blazeSecondary(int secondaryColor) {
        return 6832439;
    }

    // CAT
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 15714446))
    private static final int catPrimary(int primaryColor) {
        return 10322003;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 9794134))
    private static final int catSecondary(int secondaryColor) {
        return 7755562;
    }

    // CAVE SPIDER
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 803406))
    private static final int caveSpiderPrimary(int primaryColor) {
        return 3949640;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 11013646, ordinal = 0))
    private static final int caveSpiderSecondary(int secondaryColor) {
        return 12202032;
    }

    // CHICKEN
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 10592673, ordinal = 0))
    private static final int chickenPrimary(int primaryColor) {
        return 14204810;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 16711680, ordinal = 0))
    private static final int chickenSecondary(int secondaryColor) {
        return 13196359;
    }

    // COD
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 12691306))
    private static final int codPrimary(int primaryColor) {
        return 6450565;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 15058059))
    private static final int codSecondary(int secondaryColor) {
        return 12306889;
    }

    // COW
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 4470310))
    private static final int cowPrimary(int primaryColor) {
        return 4666411;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 10592673, ordinal = 1))
    private static final int cowSecondary(int secondaryColor) {
        return 11636859;
    }

    // CREEPER
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 894731, ordinal = 0))
    private static final int creeperPrimary(int primaryColor) {
        return 8819300;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 0, ordinal = 0), slice = @Slice(from = @At(value = "INVOKE", target = "Lnet/minecraft/item/SpawnEggItem;<init>(Lnet/minecraft/entity/EntityType;IILnet/minecraft/item/Item$Settings;)V")))
    private static final int creeperSecondary(int secondaryColor) {
        return 3093538;
    }

    // DOLPHIN
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 2243405, ordinal = 0))
    private static final int dolphinPrimary(int primaryColor) {
        return 5526873;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 16382457, ordinal = 0))
    private static final int dolphinSecondary(int secondaryColor) {
        return 10002598;
    }

    // DONKEY
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 5457209))
    private static final int donkeyPrimary(int primaryColor) {
        return 6774615;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 8811878))
    private static final int donkeySecondary(int secondaryColor) {
        return 7032633;
    }

    // DROWNED
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 9433559))
    private static final int drownedPrimary(int primaryColor) {
        return 5934929;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 7969893, ordinal = 0))
    private static final int drownedSecondary(int secondaryColor) {
        return 5071706;
    }

    // ELDER GUARDIAN
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 13552826))
    private static final int elderGuardianPrimary(int primaryColor) {
        return 7562593;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 7632531))
    private static final int elderGuardianSecondary(int secondaryColor) {
        return 2896164;
    }

    // ENDERMAN
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 1447446, ordinal = 0))
    private static final int endermanPrimary(int primaryColor) {
        return 2369312;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 0, ordinal = 1), slice = @Slice(from = @At(value = "INVOKE", target = "Lnet/minecraft/item/SpawnEggItem;<init>(Lnet/minecraft/entity/EntityType;IILnet/minecraft/item/Item$Settings;)V")))
    private static final int endermanSecondary(int secondaryColor) {
        return 6578803;
    }

    // ENDERMITE
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 1447446, ordinal = 1))
    private static final int endermitePrimary(int primaryColor) {
        return 5067850;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 7237230, ordinal = 0))
    private static final int endermiteSecondary(int secondaryColor) {
        return 3093036;
    }

    // EVOKER
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 9804699, ordinal = 0))
    private static final int evokerPrimary(int primaryColor) {
        return 3092012;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 1973274))
    private static final int evokerSecondary(int secondaryColor) {
        return 12295030;
    }

    // FOX
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 14005919))
    private static final int foxPrimary(int primaryColor) {
        return 12090961;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 13396256))
    private static final int foxSecondary(int secondaryColor) {
        return 9326647;
    }

    // GHAST
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 16382457, ordinal = 1))
    private static final int ghastPrimary(int primaryColor) {
        return 15524311;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 12369084))
    private static final int ghastSecondary(int secondaryColor) {
        return 9406595;
    }

    // GLOW SQUID
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 611926))
    private static final int glowSquidPrimary(int primaryColor) {
        return 4221539;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 8778172))
    private static final int glowSquidSecondary(int secondaryColor) {
        return 6661015;
    }

    // GOAT
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 10851452))
    private static final int goatPrimary(int primaryColor) {
        return 11842481;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 5589310))
    private static final int goatSecondary(int secondaryColor) {
        return 8023394;
    }

    // GUARDIAN
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 5931634))
    private static final int guardianPrimary(int primaryColor) {
        return 6384998;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 15826224))
    private static final int guardianSecondary(int secondaryColor) {
        return 2893873;
    }

    // HOGLIN
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 13004373, ordinal = 0))
    private static final int hoglinPrimary(int primaryColor) {
        return 10519400;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 6251620))
    private static final int hoglinSecondary(int secondaryColor) {
        return 11121062;
    }

    // HORSE
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 12623485, ordinal = 0))
    private static final int horsePrimary(int primaryColor) {
        return 10188386;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 15656192))
    private static final int horseSecondary(int secondaryColor) {
        return 7032633;
    }

    // HUSK
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 7958625))
    private static final int huskPrimary(int primaryColor) {
        return 7036235;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 15125652))
    private static final int huskSecondary(int secondaryColor) {
        return 7969893;
    }

    // LLAMA
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 12623485, ordinal = 1))
    private static final int llamaPrimary(int primaryColor) {
        return 15386781;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 10051392, ordinal = 0))
    private static final int llamaSecondary(int secondaryColor) {
        return 7559998;
    }

    // MAGMA CUBE
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 3407872, ordinal = 0))
    private static final int magmaCubePrimary(int primaryColor) {
        return 3945778;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 16579584))
    private static final int magmaCubeSecondary(int secondaryColor) {
        return 13269541;
    }

    // MOOSHROOM
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 10489616, ordinal = 0))
    private static final int mooshroomPrimary(int primaryColor) {
        return 5582380;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 12040119))
    private static final int mooshroomSecondary(int secondaryColor) {
        return 11636859;
    }

    // MULE
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 1769984))
    private static final int mulePrimary(int primaryColor) {
        return 7232073;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 5321501))
    private static final int muleSecondary(int secondaryColor) {
        return 7032633;
    }

    // OCELOT
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 15720061))
    private static final int ocelotPrimary(int primaryColor) {
        return 11048053;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 5653556))
    private static final int ocelotSecondary(int secondaryColor) {
        return 8940618;
    }

    // PANDA
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 15198183, ordinal = 0))
    private static final int pandaPrimary(int primaryColor) {
        return 11776947;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 1776418))
    private static final int pandaSecondary(int secondaryColor) {
        return 2434343;
    }

    // PARROT
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 894731, ordinal = 1))
    private static final int parrotPrimary(int primaryColor) {
        return 10048057;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 16711680, ordinal = 1))
    private static final int parrotSecondary(int secondaryColor) {
        return 13352573;
    }

    // PHANTOM
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 4411786))
    private static final int phantomPrimary(int primaryColor) {
        return 2895147;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 8978176))
    private static final int phantomSecondary(int secondaryColor) {
        return 11156102;
    }

    // PIG
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 15771042))
    private static final int pigPrimary(int primaryColor) {
        return 10519400;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 14377823))
    private static final int pigSecondary(int secondaryColor) {
        return 14071188;
    }

    // PIGLIN
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 10051392, ordinal = 1))
    private static final int piglinPrimary(int primaryColor) {
        return 10519400;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 16380836, ordinal = 0))
    private static final int piglinSecondary(int secondaryColor) {
        return 5392703;
    }

    // PIGLIN BRUTE
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 5843472))
    private static final int piglinBrutePrimary(int primaryColor) {
        return 10519400;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 16380836, ordinal = 1))
    private static final int piglinBruteSecondary(int secondaryColor) {
        return 6974058;
    }

    // PILLAGER
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 5451574))
    private static final int pillagerPrimary(int primaryColor) {
        return 3092012;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 9804699, ordinal = 1))
    private static final int pillagerSecondary(int secondaryColor) {
        return 9795259;
    }

    // POLAR BEAR
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 15921906))
    private static final int polarBearPrimary(int primaryColor) {
        return 12170656;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 9803152))
    private static final int polarBearSecondary(int secondaryColor) {
        return 5195319;
    }

    // PUFFERFISH
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 16167425, ordinal = 1))
    private static final int pufferfishPrimary(int primaryColor) {
        return 14260048;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 3654642))
    private static final int pufferfishSecondary(int secondaryColor) {
        return 7319231;
    }

    // RABBIT
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 10051392, ordinal = 2))
    private static final int rabbitPrimary(int primaryColor) {
        return 13814721;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 7555121))
    private static final int rabbitSecondary(int secondaryColor) {
        return 11238774;
    }

    // RAVAGER
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 7697520))
    private static final int ravagerPrimary(int primaryColor) {
        return 6969933;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 5984329))
    private static final int ravagerSecondary(int secondaryColor) {
        return 10920093;
    }

    // SALMON
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 10489616, ordinal = 1))
    private static final int salmonPrimary(int primaryColor) {
        return 8077636;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 951412))
    private static final int salmonSecondary(int secondaryColor) {
        return 13741223;
    }

    // SHEEP
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 15198183, ordinal = 1))
    private static final int sheepPrimary(int primaryColor) {
        return 12499118;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 16758197))
    private static final int sheepSecondary(int secondaryColor) {
        return 6706761;
    }

    // SHULKER
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 9725844))
    private static final int shulkerPrimary(int primaryColor) {
        return 5261145;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 5060690))
    private static final int shulkerSecondary(int secondaryColor) {
        return 16299627;
    }

    // SILVERFISH
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 7237230, ordinal = 1))
    private static final int silverfishPrimary(int primaryColor) {
        return 6776679;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 3158064))
    private static final int silverfishSecondary(int secondaryColor) {
        return 4802889;
    }

    // SKELETON
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 12698049))
    private static final int skeletonPrimary(int primaryColor) {
        return 11910579;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 4802889))
    private static final int skeletonSecondary(int secondaryColor) {
        return 4409397;
    }

    // SKELETON HORSE
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 6842447))
    private static final int skeletonHorsePrimary(int primaryColor) {
        return 11120276;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 15066584))
    private static final int skeletonHorseSecondary(int secondaryColor) {
        return 7032633;
    }

    // SLIME
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 5349438, ordinal = 0))
    private static final int slimePrimary(int primaryColor) {
        return 7704946;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 8306542))
    private static final int slimeSecondary(int secondaryColor) {
        return 7759718;
    }

    // SPIDER
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 3419431))
    private static final int spiderPrimary(int primaryColor) {
        return 4076844;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 11013646, ordinal = 1))
    private static final int spiderSecondary(int secondaryColor) {
        return 12202032;
    }

    // SQUID
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 2243405, ordinal = 1))
    private static final int squidPrimary(int primaryColor) {
        return 4216938;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 7375001))
    private static final int squidSecondary(int secondaryColor) {
        return 6654883;
    }

    // STRAY
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 6387319))
    private static final int strayPrimary(int primaryColor) {
        return 13558511;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 14543594))
    private static final int straySecondary(int secondaryColor) {
        return 4811884;
    }

    // STRIDER
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 10236982))
    private static final int striderPrimary(int primaryColor) {
        return 4669757;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 5065037))
    private static final int striderSecondary(int secondaryColor) {
        return 3945520;
    }

    // TRADER LLAMA
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 15377456, ordinal = 0))
    private static final int traderLlamaPrimary(int primaryColor) {
        return 15386781;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 4547222, ordinal = 0))
    private static final int traderLlamaSecondary(int secondaryColor) {
        return 8537428;
    }

    // TROPICAL FISH
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 15690005))
    private static final int tropicalFishPrimary(int primaryColor) {
        return 13922355;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 16775663))
    private static final int tropicalFishSecondary(int secondaryColor) {
        return 15059384;
    }

    // TURTLE
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 15198183, ordinal = 2))
    private static final int turtlePrimary(int primaryColor) {
        return 6917219;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 44975, ordinal = 0))
    private static final int turtleSecondary(int secondaryColor) {
        return 12565668;
    }

    // VEX
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 8032420))
    private static final int vexPrimary(int primaryColor) {
        return 10394264;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 15265265))
    private static final int vexSecondary(int secondaryColor) {
        return 6710629;
    }

    // VILLAGER
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 5651507, ordinal = 0))
    private static final int villagerPrimary(int primaryColor) {
        return 9199677;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 12422002))
    private static final int villagerSecondary(int secondaryColor) {
        return 12422002;
    }

    // VINDICATOR
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 9804699, ordinal = 2))
    private static final int vindicatorPrimary(int primaryColor) {
        return 3092012;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 2580065))
    private static final int vindicatorSecondary(int secondaryColor) {
        return 12285574;
    }

    // WANDERING TRADER
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 4547222, ordinal = 1))
    private static final int wanderingTraderPrimary(int primaryColor) {
        return 9199677;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 15377456, ordinal = 1))
    private static final int wanderingTraderSecondary(int secondaryColor) {
        return 8537428;
    }

    // WITCH
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 3407872, ordinal = 1))
    private static final int witchPrimary(int primaryColor) {
        return 3421236;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 5349438, ordinal = 1))
    private static final int witchSecondary(int secondaryColor) {
        return 8860210;
    }

    // WITHER SKELETON
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 1315860))
    private static final int witherSkeletonPrimary(int primaryColor) {
        return 6833983;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 4672845))
    private static final int witherSkeletonSecondary(int secondaryColor) {
        return 12427889;
    }

    // WOLF
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 14144467))
    private static final int wolfPrimary(int primaryColor) {
        return 5457467;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 13545366))
    private static final int wolfSecondary(int secondaryColor) {
        return 9405302;
    }

    // ZOGLIN
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 13004373, ordinal = 1))
    private static final int zoglinPrimary(int primaryColor) {
        return 9202020;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 15132390))
    private static final int zoglinSecondary(int secondaryColor) {
        return 11121062;
    }

    // ZOMBIE
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 44975, ordinal = 1))
    private static final int zombiePrimary(int primaryColor) {
        return 8425093;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 7969893, ordinal = 1))
    private static final int zombieSecondary(int secondaryColor) {
        return 5071706;
    }

    // ZOMBIE HORSE
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 3232308))
    private static final int zombieHorsePrimary(int primaryColor) {
        return 8425093;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 9945732))
    private static final int zombieHorseSecondary(int secondaryColor) {
        return 7032633;
    }

    // ZOMBIE VILLAGER
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 5651507, ordinal = 1))
    private static final int zombieVillagerPrimary(int primaryColor) {
        return 8812128;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 7969893, ordinal = 2))
    private static final int zombieVillagerSecondary(int secondaryColor) {
        return 5071706;
    }

    // ZOMBIFIED PIGLIN
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 15373203))
    private static final int zombifiedPiglinPrimary(int primaryColor) {
        return 9202020;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 5009705))
    private static final int zombifiedPiglinSecondary(int secondaryColor) {
        return 5392703;
    }

}
