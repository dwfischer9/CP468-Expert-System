
import java.util.Scanner;

/**
 * expert-system
 */
public class expertSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the dinosaur expert system!");
        System.out.println(
                "At each step, you will be asked to choose a family of dinosaur, and at the end you wil end up with a dinosaur in that specific family!.");

        char c;
        System.out.println(
                "The first choice is between Ornithischia and Saurischia. Ornithischia is a group of mostly herbivore dinosaurs named for the bird-like hip bones of this group. Saurischia is a group of dinosaurs (which contains all carnivorous dinosaurs) names for the lizard-like hip bones of this group.\nEnter 1 for Ornithischia and 2 for Saurischia.");
        c = (char) sc.next().charAt(0);
        if (c == '1') {
            System.out.println("You chose Ornithischia!");
            System.out.println(
                    "The next choice is Thyreophora. Thyreophora is a group of dinosaurs who get their name 'shield bearer' from the plating and spines of the members.\nEnter 1 for Thyreophora and 2 for more options.");
            c = (char) sc.next().charAt(0);
            if (c == '1') {
                System.out.println(
                        "You chose Thyreophora! This group is composed different kinds of 'armoured' dinosaurs! Choose between two famous dinosaurs: 1 for Stegosaurus and 2 for Ankylosaurus.");
                c = (char) sc.next().charAt(0);
                if (c == '1') {
                    System.out.println(
                            "You chose Stegosaurus! Stegosaurus was a large, four-legged herbivore dinosaur who is well known for its large plates along its spine as well as its spiky tail, called a thagomizer. While it is commonly accepted that the tail spikes were used for defense against predators, being a capable weapon, it is currently undecided as to what the purpose of the plates on the back of the Stegosaurus was. They may have been a form of mating display, able to be flushed with blood to change their colour. They might have also been used for thermal regulation!");
                } else if (c == '2') {
                    System.out.println(
                            "You chose Ankylosaurus! Ankylosaurus is species of dinosaur whose head, neck, and back were covered in osteoderms: thick bony plates that protected the body of the 8-ton herbivore. It also wielded a heavy club on the end of their tail which could deal serious damage to any dinosaur unlucky enough to be standing behind an Ankylosaur. While well armoured from above, the ankylosaur has a great weakness: It's fleshy underside is not covered in nearly as much armour.");
                } else {
                    System.err.println("The input is not valid!");
                }
            } else if (c == '2') {
                System.out.println(
                        "The choice is now between Heterodontosauridae and the Cerapoda group. Heterodontosauridae is a group of dinosaurs who were fox-sized and had teeth similar to those of a rodent! They were likely quite feathery! The group Cerapoda is composed two groups of dinosaurs who both have interesting heads, being home to species such as the dome-skulled Pachycephalosaurus and the tri-horned Triceratops! Press 1 for Heterodontosauridae and 2 for Cerapoda.");
                c = (char) sc.next().charAt(0);
                if (c == '1') {
                    System.out.println(
                            "You chose Heterodontosauridae! These basal, or primitive, dinosaurs are quite rare to find fossilized, even though it has existed on all continents, excluding Australia and Antarctica. This is likely due to the great difficulty in the fossilization process. These dinosaurs had canine like tusks and adapted teeth for chewing plant matter. They also had very large eyes.");
                }
            } else if (c == '2') {
                System.out.println(
                        "You chose the Cerapoda group! This clade of dinosaurs includes pachycephalosaurs, ornithopods and ceratopsids! These three groups of dinosaurs are home to some of the most notable herbivore dinosaurs that we know of! Press 1 for Pachycephalosaurus and 2 to choose between Triceratops and Parasaurolophus.");
                c = (char) sc.next().charAt(0);
                if (c == '1') {
                    System.out.println(
                            "You chose Pachycephalosaurus! Pachycephalosaurs are known for having a 25 cm thick bony plate in the roof of their skull. It was thought at once to have used these thick skulls in intra-species competition for mates, however, in recent years, this has been disputed, however they were most likely used against members of other species.  ");
                } else if (c == '2') {
                    System.out.println("Press 1 for Triceratops and 2 for Parasaurolophus.");
                    c = (char) sc.next().charAt(0);
                    if (c == '1') {
                        System.out.println(
                                "You chose Triceratops! These dinosaurs are known for their iconic three horned face, with two large horns above the eyes and one horn protruding above itsa beak. These horns would definitely be used for defence, able to gore its carnivourous predators, dealing serious damage to even the largest tyrannosaurs. It also has a head frill which would have protected its neck, a critical point of defense for this large walking tank.");
                    } else if (c == '2') {
                        System.out.println(
                                "You chose Parasaurolophus! This dinosaur is well known for its large head crest which, from analyzing its skull, could be used to make loud calls, similar to a horn. It may have also been used for sexual display, being able to determine both species and sex by the head crest of the dinosaur.");
                    } else {
                        System.err.println("The input is not valid!");
                    }
                } else {
                    System.err.println("The input is not valid!");
                }
            } else {
                System.err.println("The input is not valid!");
            }
        } else if (c == '2') {
            System.out.println("You chose Saurischia!");
            System.out.println(
                    "The next choice is between Sauropodomorpha and Therapoda. Sauropodomorpha is a group of long-necked that became the largest animals ever to walk on the earth. Therapoda is a group of mostly carnivourous dinosaurs with hollow bones, three toes, and claws on each limb.\nEnter 1 for Sauropodomorpha and 2 for Therapoda.");
            c = (char) sc.next().charAt(0);
            if (c == '1') {
                System.out.println("You chose Sauropodomorpha!");
                System.out.println(
                        "The next choice is between Sauropoda and Plateasauridae. Sauropoda is a family of very long necked, long tailed dinosaurs, and Plateasauridae is an early 'protosauropod'. \nEnter 1 for Sauropoda and 2 for Plateasauridae.");

                if (c == '1') {
                    System.out.println("You chose Sauropoda! ");
                    System.out.println(
                            "The next choice is between Diplodocoidea and Macronaraia and Titaonosauria. Diplodocoidea is a family of sauropod dinosaurs that include some of the longest animals ever to walk on the earth.They interestingly had new teeth growing in every thirty days due to their immense feeding habits. These animals needed to eat thousands of pounds of plant based food per day, so they would need  to have a surplus of teeth. Press 1 for Diplodocoidea and 2 for Macronaraia and Titaonosauria.");
                    c = (char) sc.next().charAt(0);
                    if (c == '1') {
                        System.out.println(
                                "You chose Diplodocoidea! These are among the most well-known sauropds on the world, known for its four pillar-like legs and its long whip-lioke tail. It grew to a length of 26 metres and likely weighed in at 14.8 metrics tonnes. It was the longest dinosaur known for many years.");
                    } else if (c == '2') {
                        System.out.println("Press 1 for Macronaraia and 2 for Titaonosauria.");
                        c = (char) sc.next().charAt(0);
                        if (c == '1') {
                            System.out.println(
                                    "You chose Macronaraia! The dinosaur Camarasaurus belongs to this clade, and is the most commonly found sauropod fossil in North America. They were also an earlier sauropod so they stood out in some ways, such as their shorter forelimbs as oppposed to later members having similarly-lengthed limbs all around. Unlike many of its sauropod cousins, Camarasaurus likely did not consume small stones, known as gastroliths to aid in digestion. Camarasaurs had very well developed teeth, and would have a new set of teeth about every 62 days.");
                        } else if (c == '2') {
                            System.out.println("You chose Titaonosauria! One of this group's most notable members is the mighty Patagotitan. Named after the region of Argentina it was found in, this dinosaur was originally thought (in 2014) to be the largest land animal to ever exist, coming in at 37 metres long and 69 metric tonnes.");
                        } else {
                            System.err.println("The input was invalid!");
                        }
                    }
                } else if (c == '2') {
                    System.out.println(
                            "You have chosen Plateosaurus! It is a very early sauropod dinosaur who stood on two legs and had long necks and arms. They made it up to around 4000 kg, compared to the other dinosaurs in the sauropodomorph family who coould reach up to 77000kg! Plateosaurus was an interesting specimen as unlike most dinosaurs, the adults were very widely varied in size, from 600 to 4000kg! Also, Plateosaurus was the fifth earliest named dinosaur genus that is still valid, discovered all the way back in 1834 in Heroldsberg, Germany. This basal (primitive) dinosaur was a precursor to the much larger, dominant sauropods that are more well known, such as Diplodocus.");
                } else {
                    System.err.println("The input was invalid!");
                }
            } else if (c == '2') {
                System.out.println("You chose Therapoda!");
                System.out.println("Press 1 for Ceratosaurus or press 2 to explore the Tetanurae group!");
                c = (char) sc.next().charAt(0);
                if (c == '1') {
                    System.out.println("You chose Ceratosaurus!");
                } else if (c == '2') {
                    System.out.println("You chose Tetanurae!");
                    System.out.println(
                            "Press 1 for Allosaurus and Megalosaurus or press 2 to explore avian dinosaurs!");
                    c = (char) sc.next().charAt(0);
                    if (c == '1') {
                        System.out.println("Press 1 for Allosaurus and press 2 to learn about Megalosaurus!");
                        c = (char) sc.next().charAt(0);
                        if (c == '1') {
                            System.out.println("You chose Allosaurus! A large, bipedal predator of the Late Jurassic epoch, allosaur had scores of shap, serrated teeth that could cut through unfortunate prey, placing it at the very top of its food chain. It likely preyed on large herbivores such as stegosaurs and sauropods, possibly hunting in packs, but it could also be the case that they hunted alone.");
                        } else if (c == '2') {
                            System.out.println("You chose Megalosaurus! The first non-avian dinosaur to be officially named, the so called 'great lizard' was classified in 1824. A complete skeleton has currently yet to be discovered, so much of this species is still unknown, but many bones have been found, so it was likely a primitive, heavily built carnivore that would be in the 8-11 metre-long range. It was thought to have hunted large herbivores, like stegosaurs and sauropods, due to its location in what is now Europe.  ");
                        } else {
                            System.err.println("The input was invalid!");
                        }
                    } else if (c == '2') {
                        System.out.println(
                                "You chose to explore avian dinosaurs! These are the dinosaurs that eventually beacame the birds that we know so well today! To learn about the ancient maniraptorian dinosaurs, press 1, and to learn about the largest dinosaur alive today, press 2!");
                        c = (char) sc.next().charAt(0);
                        if (c == '1') {
                            System.out.println("You chose the maniraptors! This clade of dinosaurs is a group of mostly feathered, winged dinosaurs. One very well known is the Microraptor, who were small and four winged. They were found in abundance well preserved in China, living in the early Cretaceuous epoch. These dinosaurs provide very important proof for the relationship between dinosaurs and modern birds. One notable characteristic is the long feathers that would benefit aerodynamics, possibly allowing the microraptor powered flight, meaning it could take off from the ground and fly without the need to glide or jump from a high elevation.`");
                        } else if (c == '2') {
                            System.out.println(
                                    "The bird with the largest wingspan alive today is the wandering albatross, with a wingspan that can reach 3.65 metres! These massive seabirds live in the southern oceans of the world and come to breed on many islands acrross Oceania and South America. They can live for up to 50 years and mate with the same partner for life.");
                        } else {
                            System.err.println("The input was invalid!");
                        }
                    } else {
                        System.err.println("The input was invalid!");
                    }
                } else {
                    System.err.println("The input was invalid!");
                }
            } else {
                System.err.println("The input was invalid.");
            }
        } else {
            System.err.println("The input was invalid.");
        }
        System.out.println("Thank you for using the dinosaur expert system!");
        System.out.println("Have a nice day!");
        sc.close();
    }

}
