import { OddsOfSurvival } from "./enums/odds-of-survival";
import { SurvivorSkin } from "./survivor-skin";

export interface Survivor {
    id: number;
    name: string;
    title: string;
    description: string;
    motto: string;
    icon: string;
    portrait: string;
    birthday: string;
    favoriteFood: string;
    oddsOfSurvival: OddsOfSurvival;
    health: number;
    hunger: number;
    sanity: number;
    perks: string[];
    skins: SurvivorSkin[];
}
