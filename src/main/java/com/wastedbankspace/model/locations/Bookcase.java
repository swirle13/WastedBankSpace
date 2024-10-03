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
public enum Bookcase implements StorableItem {
    CONSTRUCTION_GUIDE(ItemID.CONSTRUCTION_GUIDE),
    GAME_BOOK(ItemID.GAME_BOOK),
    SECURITY_BOOK(ItemID.SECURITY_BOOK),
    STRONGHOLD_NOTES(ItemID.STRONGHOLD_NOTES),
    ABYSSAL_BOOK(ItemID.ABYSSAL_BOOK),
    GIANNES_COOK_BOOK(ItemID.GIANNES_COOK_BOOK),
    COCKTAIL_GUIDE(ItemID.COCKTAIL_GUIDE),
    QUEEN_HELP_BOOK(ItemID.QUEEN_HELP_BOOK),
    DIARY(ItemID.DIARY),
    INSTRUCTION_MANUAL(ItemID.INSTRUCTION_MANUAL),
    BOOK_ON_CHEMICALS(ItemID.BOOK_ON_CHEMICALS),
    BATTERED_BOOK(ItemID.BATTERED_BOOK),
    VARMENS_NOTES(ItemID.VARMENS_NOTES),
    GOBLIN_SYMBOL_BOOK(ItemID.GOBLIN_SYMBOL_BOOK),
    TRANSLATION(ItemID.TRANSLATION),
    TRANSLATION_BOOK(ItemID.TRANSLATION_BOOK),
    GLOUGHS_JOURNAL(ItemID.GLOUGHS_JOURNAL),
    JOURNAL_3845(ItemID.JOURNAL_3845),
    DIARY_3846(ItemID.DIARY_3846),
    MANUAL(ItemID.MANUAL),
    SHAMANS_TOME(ItemID.SHAMANS_TOME),
    BINDING_BOOK(ItemID.BINDING_BOOK),
    GHRIMS_BOOK(ItemID.GHRIMS_BOOK),
    ASTRONOMY_BOOK(ItemID.ASTRONOMY_BOOK),
    OLD_JOURNAL(ItemID.OLD_JOURNAL),
    HISTORY_OF_IBAN(ItemID.HISTORY_OF_IBAN),
    BIG_BOOK_OF_BANGS(ItemID.BIG_BOOK_OF_BANGS),
    CADARN_LINEAGE(ItemID.CADARN_LINEAGE),
    CRYSTAL_SINGING_FOR_BEGINNERS(ItemID.CRYSTAL_SINGING_FOR_BEGINNERS),
    DIARY_3395(ItemID.DIARY_3395),
    BOOK(ItemID.BOOK),
    GUIDE_BOOK(ItemID.GUIDE_BOOK),
    BOOK_ON_BAXTORIAN(ItemID.BOOK_ON_BAXTORIAN),
    DWARVEN_LORE(ItemID.DWARVEN_LORE),
    EMBALMING_MANUAL(ItemID.EMBALMING_MANUAL),
    DEMONIC_TOME(ItemID.DEMONIC_TOME),
    CRUMBLING_TOME(ItemID.CRUMBLING_TOME),
    BOOK_6767(ItemID.BOOK_6767),
    EDERNS_JOURNAL(ItemID.EDERNS_JOURNAL),
    PRIFDDINAS_HISTORY(ItemID.PRIFDDINAS_HISTORY),
    EASTERN_DISCOVERY(ItemID.EASTERN_DISCOVERY),
    EASTERN_SETTLEMENT(ItemID.EASTERN_SETTLEMENT),
    THE_GREAT_DIVIDE(ItemID.THE_GREAT_DIVIDE),
    JOURNAL_6755(ItemID.JOURNAL_6755),
    MOONCLAN_MANUAL(ItemID.MOONCLAN_MANUAL),
    HERMANS_BOOK(ItemID.HERMANS_BOOK),
    PIE_RECIPE_BOOK(ItemID.PIE_RECIPE_BOOK),
    BOOK_O_PIRACY(ItemID.BOOK_O_PIRACY),
    BREWIN_GUIDE(ItemID.BREWIN_GUIDE),
    BURNT_DIARY(ItemID.BURNT_DIARY),
    ARENA_BOOK(ItemID.ARENA_BOOK),
    SINKETHS_DIARY(ItemID.SINKETHS_DIARY),
    DAGONHAI_HISTORY(ItemID.DAGONHAI_HISTORY),
    TARNS_DIARY(ItemID.TARNS_DIARY),
    BIRD_BOOK(ItemID.BIRD_BOOK),
    FEATHERED_JOURNAL(ItemID.FEATHERED_JOURNAL),
    FARMING_MANUAL(ItemID.FARMING_MANUAL),
    PRAYER_BOOK(ItemID.PRAYER_BOOK),
    BEATEN_BOOK(ItemID.BEATEN_BOOK),
    A_HANDWRITTEN_BOOK(ItemID.A_HANDWRITTEN_BOOK),
    HISTORIES_OF_THE_HALLOWLAND(ItemID.HISTORIES_OF_THE_HALLOWLAND),
    MODERN_DAY_MORYTANIA(ItemID.MODERN_DAY_MORYTANIA),
    THE_SLEEPING_SEVEN(ItemID.THE_SLEEPING_SEVEN),
    CLOCKWORK_BOOK(ItemID.CLOCKWORK_BOOK),
    GOBLIN_BOOK(ItemID.GOBLIN_BOOK),
    MY_NOTES(ItemID.MY_NOTES),
    EXPLORERS_NOTES(ItemID.EXPLORERS_NOTES),
    GLASSBLOWING_BOOK(ItemID.GLASSBLOWING_BOOK),
    ENTOMOLOGISTS_DIARY(ItemID.ENTOMOLOGISTS_DIARY),
    OHNS_DIARY(ItemID.OHNS_DIARY),
    OVERSEERS_BOOK(ItemID.OVERSEERS_BOOK),
    BOOK_OF_SPYOLOGY(ItemID.BOOK_OF_SPYOLOGY),
    CREATURE_KEEPERS_JOURNAL(ItemID.CREATURE_KEEPERS_JOURNAL),
    NISTIRIOS_MANIFESTO(ItemID.NISTIRIOS_MANIFESTO),
    TEKTONS_JOURNAL(ItemID.TEKTONS_JOURNAL),
    TRANSDIMENSIONAL_NOTES(ItemID.TRANSDIMENSIONAL_NOTES),
    VANGUARD_JUDGEMENT(ItemID.VANGUARD_JUDGEMENT),
    DARK_JOURNAL(ItemID.DARK_JOURNAL),
    HOUNDMASTERS_DIARY(ItemID.HOUNDMASTERS_DIARY),
    FOSSIL_ISLAND_NOTE_BOOK(ItemID.FOSSIL_ISLAND_NOTE_BOOK),
    ARCHAEOLOGISTS_DIARY(ItemID.ARCHAEOLOGISTS_DIARY),
    ANCIENT_DIARY(ItemID.ANCIENT_DIARY),
    VARLAMORE_ENVOY(ItemID.VARLAMORE_ENVOY),
    AIVAS_DIARY(ItemID.AIVAS_DIARY),
    MALUMACS_JOURNAL(ItemID.MALUMACS_JOURNAL),
    UNGAEL_LAB_NOTES(ItemID.UNGAEL_LAB_NOTES),
    LITHKREN_VAULT_NOTES(ItemID.LITHKREN_VAULT_NOTES),
    ABLENKIANS_ESCAPE(ItemID.ABLENKIANS_ESCAPE),
    IMCANDORIAS_FALL(ItemID.IMCANDORIAS_FALL),
    IMAFORES_BETRAYAL(ItemID.IMAFORES_BETRAYAL),
    LUTWIDGE_AND_THE_MOONFLY(ItemID.LUTWIDGE_AND_THE_MOONFLY),
    SERAFINA(ItemID.SERAFINA),
    THE_WEEPING(ItemID.THE_WEEPING),
    OLD_DIARY(ItemID.OLD_DIARY),
    SERAFINAS_DIARY(ItemID.SERAFINAS_DIARY),
    THE_BUTCHER(ItemID.THE_BUTCHER),
    ARACHNIDS_OF_VAMPYRIUM(ItemID.ARACHNIDS_OF_VAMPYRIUM),
    THE_SHADOW_REALM(ItemID.THE_SHADOW_REALM),
    THE_WILD_HUNT(ItemID.THE_WILD_HUNT),
    VERZIK_VITUR__PATIENT_RECORD(ItemID.VERZIK_VITUR__PATIENT_RECORD),
    WEISS_FIRE_NOTES(ItemID.WEISS_FIRE_NOTES),
    COLLECTION_LOG(ItemID.COLLECTION_LOG),
    GIELINORS_FLORA__FLOWERS(ItemID.GIELINORS_FLORA__FLOWERS),
    GIELINORS_FLORA__BUSHES(ItemID.GIELINORS_FLORA__BUSHES),
    GIELINORS_FLORA__HOPS(ItemID.GIELINORS_FLORA__HOPS),
    GIELINORS_FLORA__ALLOTMENTS(ItemID.GIELINORS_FLORA__ALLOTMENTS),
    GIELINORS_FLORA__HERBS(ItemID.GIELINORS_FLORA__HERBS),
    GIELINORS_FLORA__TREES(ItemID.GIELINORS_FLORA__TREES),
    GIELINORS_FLORA__FRUIT(ItemID.GIELINORS_FLORA__FRUIT),
    TOME_OF_THE_SUN(ItemID.TOME_OF_THE_SUN),
    TOME_OF_THE_MOON(ItemID.TOME_OF_THE_MOON),
    TOME_OF_THE_TEMPLE(ItemID.TOME_OF_THE_TEMPLE),
    ODE_TO_ETERNITY(ItemID.ODE_TO_ETERNITY),
    CRAZED_SCRIBBLES(ItemID.CRAZED_SCRIBBLES),
    A_DEAR_FRIEND(ItemID.A_DEAR_FRIEND),
    ON_LEPRECHAUNS(ItemID.ON_LEPRECHAUNS),
    BLOODY_DIARY(ItemID.BLOODY_DIARY),
    THE_EIGHT_CLANS(ItemID.THE_EIGHT_CLANS),
    GOLLWYNS_FINAL_STATEMENT(ItemID.GOLLWYNS_FINAL_STATEMENT),
    NIFF__HARRY(ItemID.NIFF__HARRY),
    SOGGY_JOURNAL(ItemID.SOGGY_JOURNAL),
    EBRILLS_JOURNAL(ItemID.EBRILLS_JOURNAL),
    STAINED_JOURNAL(ItemID.STAINED_JOURNAL),
    THE_TRUTH_BEHIND_THE_MYTH_EXCERPT(ItemID.THE_TRUTH_BEHIND_THE_MYTH_EXCERPT),
    THE_LIVING_STATUES(ItemID.THE_LIVING_STATUES),
    THE_SPURNED_DEMON(ItemID.THE_SPURNED_DEMON),
    LEGENDS_OF_THE_MOUNTAIN(ItemID.LEGENDS_OF_THE_MOUNTAIN),
    HARMONY(ItemID.HARMONY),
    BALLAD_OF_THE_BASILISK(ItemID.BALLAD_OF_THE_BASILISK),
    A_TASTE_OF_HOPE(ItemID.A_TASTE_OF_HOPE),
    STRANGE_HALLOWED_TOME(ItemID.STRANGE_HALLOWED_TOME),
    NEILANS_JOURNAL(ItemID.NEILANS_JOURNAL),
    SOUL_WARS_GUIDE(ItemID.SOUL_WARS_GUIDE),
    TREE_WIZARDS_JOURNAL(ItemID.TREE_WIZARDS_JOURNAL),
    BLOODY_NOTES(ItemID.BLOODY_NOTES),
    THE_DESERT_TROUT__SHIPS_LOG(ItemID.THE_DESERT_TROUT__SHIPS_LOG),
    SPIRIT_ANGLERS_RESEARCH_NOTES(ItemID.SPIRIT_ANGLERS_RESEARCH_NOTES),
    MOUNT_KARUULM_DIARY(ItemID.MOUNT_KARUULM_DIARY),
    ATLAXS_DIARY(ItemID.ATLAXS_DIARY),
    AKILAS_JOURNAL(ItemID.AKILAS_JOURNAL),
    HETS_CAPTURE(ItemID.HETS_CAPTURE),
    APMEKENS_CAPTURE(ItemID.APMEKENS_CAPTURE),
    SCABARAS_CAPTURE(ItemID.SCABARAS_CAPTURE),
    CRONDIS_CAPTURE(ItemID.CRONDIS_CAPTURE),
    THE_WARDENS(ItemID.THE_WARDENS),
    THE_JACKALS_TORCH(ItemID.THE_JACKALS_TORCH),
    KASONDES_JOURNAL(ItemID.KASONDES_JOURNAL),
    YEWNOCKS_NOTES(ItemID.YEWNOCKS_NOTES),
    MOVARIOS_NOTES_VOLUME_1(ItemID.MOVARIOS_NOTES_VOLUME_1),
    MOVARIOS_NOTES_VOLUME_2(ItemID.MOVARIOS_NOTES_VOLUME_2),
    THE_HUEYCOATL(ItemID.THE_HUEYCOATL),
    MOONRISE_WINES(ItemID.MOONRISE_WINES);

    private final int itemID;
    @Getter
    private final String location = "Bookcase";

    @Getter
    private final boolean isBis;

    Bookcase(int itemID)
    {
        this.itemID = itemID;
        this.isBis = false;
    }
}
