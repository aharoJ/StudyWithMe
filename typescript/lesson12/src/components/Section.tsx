import { ReactNode } from "react";

type SectionProps = {
  title?: string;
  children: ReactNode;
};

/*
 * LEGACY CODE
 *export const Section:React.FunctionComponent
 *export const Section: React.FC<{title:string}>= ({children, title})=>
 */

export const Section = ({
  children,
  title = "Default Title",
}: SectionProps) => {
  return (
    <section>
      <h2> {title}</h2>
      <p>{children}</p>
    </section>
  );
};
