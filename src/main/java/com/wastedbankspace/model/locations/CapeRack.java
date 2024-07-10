/*
 * BSD 2-Clause License
 *
 * Copyright (c) 2021, Riley McGee
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.wastedbankspace.model.locations;

import com.wastedbankspace.model.StorableItem;
import lombok.Getter;
import net.runelite.api.ItemID;

@Getter
public enum CapeRack implements StorableItem {
    ACHIEVEMENT_DIARY_HOOD(ItemID.ACHIEVEMENT_DIARY_HOOD),
    ACHIEVEMENT_DIARY_CAPE(ItemID.ACHIEVEMENT_DIARY_CAPE),
    ACHIEVEMENT_DIARY_CAPE_T(ItemID.ACHIEVEMENT_DIARY_CAPE_T),
    AGILITY_HOOD(ItemID.AGILITY_HOOD),
    AGILITY_CAPE(ItemID.AGILITY_CAPE),
    AGILITY_CAPET(ItemID.AGILITY_CAPET),
    ATTACK_HOOD(ItemID.ATTACK_HOOD),
    ATTACK_CAPE(ItemID.ATTACK_CAPE),
    ATTACK_CAPET(ItemID.ATTACK_CAPET),
    CHAMPIONS_CAPE(ItemID.CHAMPIONS_CAPE),
    CONSTRUCT_HOOD(ItemID.CONSTRUCT_HOOD),
    CONSTRUCT_CAPE(ItemID.CONSTRUCT_CAPE),
    CONSTRUCT_CAPET(ItemID.CONSTRUCT_CAPET),
    COOKING_HOOD(ItemID.COOKING_HOOD),
    COOKING_CAPE(ItemID.COOKING_CAPE),
    COOKING_CAPET(ItemID.COOKING_CAPET),
    CRAFTING_HOOD(ItemID.CRAFTING_HOOD),
    CRAFTING_CAPE(ItemID.CRAFTING_CAPE),
    CRAFTING_CAPET(ItemID.CRAFTING_CAPET),
    DEFENCE_HOOD(ItemID.DEFENCE_HOOD),
    DEFENCE_CAPE(ItemID.DEFENCE_CAPE),
    DEFENCE_CAPET(ItemID.DEFENCE_CAPET),
    FARMING_HOOD(ItemID.FARMING_HOOD),
    FARMING_CAPE(ItemID.FARMING_CAPE),
    FARMING_CAPET(ItemID.FARMING_CAPET),
    FIRE_CAPE(ItemID.FIRE_CAPE),
    FIREMAKING_HOOD(ItemID.FIREMAKING_HOOD),
    FIREMAKING_CAPE(ItemID.FIREMAKING_CAPE),
    FIREMAKING_CAPET(ItemID.FIREMAKING_CAPET),
    FISHING_HOOD(ItemID.FISHING_HOOD),
    FISHING_CAPE(ItemID.FISHING_CAPE),
    FISHING_CAPET(ItemID.FISHING_CAPET),
    FLETCHING_HOOD(ItemID.FLETCHING_HOOD),
    FLETCHING_CAPE(ItemID.FLETCHING_CAPE),
    FLETCHING_CAPET(ItemID.FLETCHING_CAPET),
    GAUNTLET_CAPE(ItemID.GAUNTLET_CAPE),
    HERBLORE_HOOD(ItemID.HERBLORE_HOOD),
    HERBLORE_CAPE(ItemID.HERBLORE_CAPE),
    HERBLORE_CAPET(ItemID.HERBLORE_CAPET),
    HITPOINTS_HOOD(ItemID.HITPOINTS_HOOD),
    HITPOINTS_CAPE(ItemID.HITPOINTS_CAPE),
    HITPOINTS_CAPET(ItemID.HITPOINTS_CAPET),
    HUNTER_HOOD_PoHCapeRack(ItemID.HUNTER_HOOD),
    HUNTER_CAPE_PoHCapeRack(ItemID.HUNTER_CAPE),
    HUNTER_CAPET_PoHCapeRack(ItemID.HUNTER_CAPET),
    ICTHLARINS_SHROUD_TIER_1(ItemID.ICTHLARINS_SHROUD_TIER_1),
    ICTHLARINS_SHROUD_TIER_2(ItemID.ICTHLARINS_SHROUD_TIER_2),
    ICTHLARINS_SHROUD_TIER_3(ItemID.ICTHLARINS_SHROUD_TIER_3),
    ICTHLARINS_SHROUD_TIER_4(ItemID.ICTHLARINS_SHROUD_TIER_4),
    ICTHLARINS_SHROUD_TIER_5(ItemID.ICTHLARINS_SHROUD_TIER_5),
    INFERNAL_CAPE(ItemID.INFERNAL_CAPE),
    CAPE_OF_LEGENDS(ItemID.CAPE_OF_LEGENDS),
    GUTHIX_CAPE(ItemID.GUTHIX_CAPE),
    IMBUED_GUTHIX_CAPE(ItemID.IMBUED_GUTHIX_CAPE),
    SARADOMIN_CAPE(ItemID.SARADOMIN_CAPE),
    IMBUED_SARADOMIN_CAPE(ItemID.IMBUED_SARADOMIN_CAPE),
    ZAMORAK_CAPE(ItemID.ZAMORAK_CAPE),
    IMBUED_ZAMORAK_CAPE(ItemID.IMBUED_ZAMORAK_CAPE),
    MAGIC_HOOD(ItemID.MAGIC_HOOD),
    MAGIC_CAPE(ItemID.MAGIC_CAPE),
    MAGIC_CAPET(ItemID.MAGIC_CAPET),
    // MAX CAPES
    MAX_HOOD(ItemID.MAX_HOOD),
    MAX_CAPE(ItemID.MAX_CAPE),
    ARDOUGNE_MAX_HOOD(ItemID.ARDOUGNE_MAX_HOOD),
    ARDOUGNE_MAX_CAPE(ItemID.ARDOUGNE_MAX_CAPE),
    ACCUMULATOR_MAX_HOOD(ItemID.ACCUMULATOR_MAX_HOOD),
    ACCUMULATOR_MAX_CAPE(ItemID.ACCUMULATOR_MAX_CAPE),
    ASSEMBLER_MAX_HOOD(ItemID.ASSEMBLER_MAX_HOOD),
    ASSEMBLER_MAX_CAPE(ItemID.ASSEMBLER_MAX_CAPE),
    DIZANAS_MAX_HOOD(ItemID.DIZANAS_MAX_HOOD),
    DIZANAS_MAX_CAPE(ItemID.DIZANAS_MAX_CAPE),
    FIRE_MAX_HOOD(ItemID.FIRE_MAX_HOOD),
    FIRE_MAX_CAPE(ItemID.FIRE_MAX_CAPE),
    INFERNAL_MAX_HOOD(ItemID.INFERNAL_MAX_HOOD),
    INFERNAL_MAX_CAPE(ItemID.INFERNAL_MAX_CAPE),
    IMBUED_GUTHIX_MAX_HOOD(ItemID.IMBUED_GUTHIX_MAX_HOOD),
    IMBUED_GUTHIX_MAX_CAPE(ItemID.IMBUED_GUTHIX_MAX_CAPE),
    IMBUED_SARADOMIN_MAX_HOOD(ItemID.IMBUED_SARADOMIN_MAX_HOOD),
    IMBUED_SARADOMIN_MAX_CAPE(ItemID.IMBUED_SARADOMIN_MAX_CAPE),
    IMBUED_ZAMORAK_MAX_HOOD(ItemID.IMBUED_ZAMORAK_MAX_HOOD),
    IMBUED_ZAMORAK_MAX_CAPE(ItemID.IMBUED_ZAMORAK_MAX_CAPE),
    MASORI_ASSEMBLER_MAX_HOOD(ItemID.MASORI_ASSEMBLER_MAX_HOOD),
    MASORI_ASSEMBLER_MAX_CAPE(ItemID.MASORI_ASSEMBLER_MAX_CAPE),
    MYTHICAL_MAX_HOOD(ItemID.MYTHICAL_MAX_HOOD),
    MYTHICAL_MAX_CAPE(ItemID.MYTHICAL_MAX_CAPE),
    GUTHIX_MAX_HOOD(ItemID.GUTHIX_MAX_HOOD),
    GUTHIX_MAX_CAPE(ItemID.GUTHIX_MAX_CAPE),
    SARADOMIN_MAX_HOOD_MAX_CAPE(ItemID.SARADOMIN_MAX_HOOD),
    SARADOMIN_MAX_CAPE(ItemID.SARADOMIN_MAX_CAPE),
    ZAMORAK_MAX_HOOD(ItemID.ZAMORAK_MAX_HOOD),
    ZAMORAK_MAX_CAPE(ItemID.ZAMORAK_MAX_CAPE),

    MINING_HOOD(ItemID.MINING_HOOD),
    MINING_CAPE(ItemID.MINING_CAPE),
    MINING_CAPET(ItemID.MINING_CAPET),
    MUSIC_HOOD(ItemID.MUSIC_HOOD),
    MUSIC_CAPE(ItemID.MUSIC_CAPE),
    MUSIC_CAPET(ItemID.MUSIC_CAPET),
    MYTHICAL_CAPE(ItemID.MYTHICAL_CAPE),
    OBSIDIAN_CAPE(ItemID.OBSIDIAN_CAPE),
    PRAYER_HOOD(ItemID.PRAYER_HOOD),
    PRAYER_CAPE(ItemID.PRAYER_CAPE),
    PRAYER_CAPET(ItemID.PRAYER_CAPET),
    QUEST_POINT_HOOD(ItemID.QUEST_POINT_HOOD),
    QUEST_POINT_CAPE(ItemID.QUEST_POINT_CAPE),
    QUEST_POINT_CAPE_T(ItemID.QUEST_POINT_CAPE_T),
    RANGING_HOOD(ItemID.RANGING_HOOD),
    RANGING_CAPE(ItemID.RANGING_CAPE),
    RANGING_CAPET(ItemID.RANGING_CAPET),
    RUNECRAFT_HOOD(ItemID.RUNECRAFT_HOOD),
    RUNECRAFT_CAPE(ItemID.RUNECRAFT_CAPE),
    RUNECRAFT_CAPET(ItemID.RUNECRAFT_CAPET),
    SOUL_CAPE(ItemID.SOUL_CAPE),
    SINHAZA_SHROUD_TIER_1(ItemID.SINHAZA_SHROUD_TIER_1),
    SINHAZA_SHROUD_TIER_2(ItemID.SINHAZA_SHROUD_TIER_2),
    SINHAZA_SHROUD_TIER_3(ItemID.SINHAZA_SHROUD_TIER_3),
    SINHAZA_SHROUD_TIER_4(ItemID.SINHAZA_SHROUD_TIER_4),
    SINHAZA_SHROUD_TIER_5(ItemID.SINHAZA_SHROUD_TIER_5),
    SLAYER_HOOD(ItemID.SLAYER_HOOD),
    SLAYER_CAPE(ItemID.SLAYER_CAPE),
    SLAYER_CAPET(ItemID.SLAYER_CAPET),
    SMITHING_HOOD(ItemID.SMITHING_HOOD),
    SMITHING_CAPE(ItemID.SMITHING_CAPE),
    SMITHING_CAPET(ItemID.SMITHING_CAPET),
    SPOTTED_CAPE(ItemID.SPOTTED_CAPE),
    SPOTTIER_CAPE(ItemID.SPOTTIER_CAPE),
    STRENGTH_HOOD(ItemID.STRENGTH_HOOD),
    STRENGTH_CAPE(ItemID.STRENGTH_CAPE),
    STRENGTH_CAPET(ItemID.STRENGTH_CAPET),
    THIEVING_HOOD(ItemID.THIEVING_HOOD),
    THIEVING_CAPE(ItemID.THIEVING_CAPE),
    THIEVING_CAPET(ItemID.THIEVING_CAPET),
    VICTORS_CAPE_1(ItemID.VICTORS_CAPE_1),
    VICTORS_CAPE_10(ItemID.VICTORS_CAPE_10),
    VICTORS_CAPE_50(ItemID.VICTORS_CAPE_50),
    VICTORS_CAPE_100(ItemID.VICTORS_CAPE_100),
    VICTORS_CAPE_500(ItemID.VICTORS_CAPE_500),
    VICTORS_CAPE_1000(ItemID.VICTORS_CAPE_1000),
    // TEAM CAPE
    TEAM1_CAPE(ItemID.TEAM1_CAPE),
    TEAM2_CAPE(ItemID.TEAM2_CAPE),
    TEAM3_CAPE(ItemID.TEAM3_CAPE),
    TEAM4_CAPE(ItemID.TEAM4_CAPE),
    TEAM5_CAPE(ItemID.TEAM5_CAPE),
    TEAM6_CAPE(ItemID.TEAM6_CAPE),
    TEAM7_CAPE(ItemID.TEAM7_CAPE),
    TEAM8_CAPE(ItemID.TEAM8_CAPE),
    TEAM9_CAPE(ItemID.TEAM9_CAPE),
    TEAM10_CAPE(ItemID.TEAM10_CAPE),
    TEAM11_CAPE(ItemID.TEAM11_CAPE),
    TEAM12_CAPE(ItemID.TEAM12_CAPE),
    TEAM13_CAPE(ItemID.TEAM13_CAPE),
    TEAM14_CAPE(ItemID.TEAM14_CAPE),
    TEAM15_CAPE(ItemID.TEAM15_CAPE),
    TEAM16_CAPE(ItemID.TEAM16_CAPE),
    TEAM17_CAPE(ItemID.TEAM17_CAPE),
    TEAM18_CAPE(ItemID.TEAM18_CAPE),
    TEAM19_CAPE(ItemID.TEAM19_CAPE),
    TEAM20_CAPE(ItemID.TEAM20_CAPE),
    TEAM21_CAPE(ItemID.TEAM21_CAPE),
    TEAM22_CAPE(ItemID.TEAM22_CAPE),
    TEAM23_CAPE(ItemID.TEAM23_CAPE),
    TEAM24_CAPE(ItemID.TEAM24_CAPE),
    TEAM25_CAPE(ItemID.TEAM25_CAPE),
    TEAM26_CAPE(ItemID.TEAM26_CAPE),
    TEAM27_CAPE(ItemID.TEAM27_CAPE),
    TEAM28_CAPE(ItemID.TEAM28_CAPE),
    TEAM29_CAPE(ItemID.TEAM29_CAPE),
    TEAM30_CAPE(ItemID.TEAM30_CAPE),
    TEAM31_CAPE(ItemID.TEAM31_CAPE),
    TEAM32_CAPE(ItemID.TEAM32_CAPE),
    TEAM33_CAPE(ItemID.TEAM33_CAPE),
    TEAM34_CAPE(ItemID.TEAM34_CAPE),
    TEAM35_CAPE(ItemID.TEAM35_CAPE),
    TEAM36_CAPE(ItemID.TEAM36_CAPE),
    TEAM37_CAPE(ItemID.TEAM37_CAPE),
    TEAM38_CAPE(ItemID.TEAM38_CAPE),
    TEAM39_CAPE(ItemID.TEAM39_CAPE),
    TEAM40_CAPE(ItemID.TEAM40_CAPE),
    TEAM41_CAPE(ItemID.TEAM41_CAPE),
    TEAM42_CAPE(ItemID.TEAM42_CAPE),
    TEAM43_CAPE(ItemID.TEAM43_CAPE),
    TEAM44_CAPE(ItemID.TEAM44_CAPE),
    TEAM45_CAPE(ItemID.TEAM45_CAPE),
    TEAM46_CAPE(ItemID.TEAM46_CAPE),
    TEAM47_CAPE(ItemID.TEAM47_CAPE),
    TEAM48_CAPE(ItemID.TEAM48_CAPE),
    TEAM49_CAPE(ItemID.TEAM49_CAPE),
    TEAM50_CAPE(ItemID.TEAM50_CAPE),

    TEAM_CAPE_ZERO(ItemID.TEAM_CAPE_ZERO),
    TEAM_CAPE_I(ItemID.TEAM_CAPE_I),
    TEAM_CAPE_X(ItemID.TEAM_CAPE_X),

    WOODCUTTING_HOOD(ItemID.WOODCUTTING_HOOD),
    WOODCUTTING_CAPE_2(ItemID.WOODCUTTING_CAPE),
    WOODCUTTING_CAPE_T(ItemID.WOODCUT_CAPET),

    XERICS_CHAMPION(ItemID.XERICS_CHAMPION),
    XERICS_GENERAL(ItemID.XERICS_GENERAL),
    XERICS_GUARD(ItemID.XERICS_GUARD),
    XERICS_SENTINEL(ItemID.XERICS_SENTINEL),
    XERICS_WARRIOR(ItemID.XERICS_WARRIOR);

    private final int itemID;
    @Getter
    private final String location = "Cape Rack";

    CapeRack(int itemID) {
        this.itemID = itemID;
    }
}
