import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class votingsystemjmenubaar extends JFrame implements ActionListener{
	JMenuBar mb;
	JMenu f,e,ff,cc,hh,nn,jj,pp;
	JMenuItem m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,m19,m20,m21,m22,m23,m24,m25,m26,m27,m28,m29,m30,m31,m32,m33,m34,m35,m36,m37,m38,m39,m40;
	public votingsystemjmenubaar()
	{
		setTitle("Menu");
		setSize(2000,2000);
		setLayout(null);
		getContentPane().setBackground(Color.ORANGE);
		mb=new JMenuBar();
		f=new JMenu("City Master");
		m1=new JMenuItem("Insert");
		m2=new JMenuItem("Delete");
		m3=new JMenuItem("Find");
		m4=new JMenuItem("Update");
		m5=new JMenuItem("Show All");
		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);
		m4.addActionListener(this);
		m5.addActionListener(this);
		
		f.add(m1);
		f.addSeparator();
		f.add(m2);
		f.addSeparator();
		f.add(m3);
		f.addSeparator();
		f.add(m4);
		f.addSeparator();
		f.add(m5);
		mb.add(f);
		e=new JMenu("Voters");
		m6=new JMenuItem("Insert");
		m7=new JMenuItem("Delete");
		m8=new JMenuItem("Find");
		m9=new JMenuItem("Update");
		m10=new JMenuItem("Show All");
		m6.addActionListener(this);
		m7.addActionListener(this);
		m8.addActionListener(this);
		m9.addActionListener(this);
		m10.addActionListener(this);
		
		e.add(m6);
		e.addSeparator();
		e.add(m7);
		e.addSeparator();
		e.add(m8);
		e.addSeparator();
		e.add(m9);
		e.addSeparator();
		e.add(m10);
		mb.add(e);
		
		ff=new JMenu("Election");
		m11=new JMenuItem("Insert");
		m12=new JMenuItem("Delete");
		m13=new JMenuItem("Find");
		m14=new JMenuItem("Update");
		m15=new JMenuItem("Show All");
		
		m11.addActionListener(this);
		m12.addActionListener(this);
		m13.addActionListener(this);
		m14.addActionListener(this);
		m15.addActionListener(this);
		
		ff.add(m11);
		ff.addSeparator();
		ff.add(m12);
		ff.addSeparator();
		ff.add(m13);
		ff.addSeparator();
		ff.add(m14);
		ff.addSeparator();
		ff.add(m15);
		ff.addSeparator();
		mb.add(ff);
		
		cc=new JMenu("Voting Data");
		m16=new JMenuItem("Insert");
		m17=new JMenuItem("Delete");
		m18=new JMenuItem("Find");
		m19=new JMenuItem("Update");
		m20=new JMenuItem("Show All");
		
		m16.addActionListener(this);
		m17.addActionListener(this);
		m18.addActionListener(this);
		m19.addActionListener(this);
		m20.addActionListener(this);
		
		cc.add(m16);
		cc.addSeparator();
		cc.add(m17);
		cc.addSeparator();
		cc.add(m18);
		cc.addSeparator();
		cc.add(m19);
		cc.addSeparator();
		cc.add(m20);
		cc.addSeparator();
		mb.add(cc);
		
		hh=new JMenu("Party Master");
		m21=new JMenuItem("Insert");
		m22=new JMenuItem("Delete");
		m23=new JMenuItem("Find");
		m24=new JMenuItem("Update");
		m25=new JMenuItem("Show All");
		
		m21.addActionListener(this);
		m22.addActionListener(this);
		m23.addActionListener(this);
		m24.addActionListener(this);
		m25.addActionListener(this);
		
		hh.add(m21);
		hh.addSeparator();
		hh.add(m22);
		hh.addSeparator();
		hh.add(m23);
		hh.addSeparator();
		hh.add(m24);
		hh.addSeparator();
		hh.add(m25);
		hh.addSeparator();
		mb.add(hh);
		
		nn=new JMenu("Ward Master");
		m26=new JMenuItem("Insert");
		m27=new JMenuItem("Delete");
		m28=new JMenuItem("Find");
		m29=new JMenuItem("Update");
		m30=new JMenuItem("Show All");
		
		m26.addActionListener(this);
		m27.addActionListener(this);
		m28.addActionListener(this);
		m29.addActionListener(this);
		m30.addActionListener(this);
		
		nn.add(m26);
		nn.addSeparator();
		nn.add(m27);
		nn.addSeparator();
		nn.add(m28);
		nn.addSeparator();
		nn.add(m29);
		nn.addSeparator();
		nn.add(m30);
		nn.addSeparator();
		mb.add(nn);
		
		jj=new JMenu("Cadidates");
		m31=new JMenuItem("Insert");
		m32=new JMenuItem("Delete");
		m33=new JMenuItem("Find");
		m34=new JMenuItem("Update");
		m35=new JMenuItem("Show All");
		
		m31.addActionListener(this);
		m32.addActionListener(this);
		m33.addActionListener(this);
		m34.addActionListener(this);
		m35.addActionListener(this);
		
		jj.add(m31);
		jj.addSeparator();
		jj.add(m32);
		jj.addSeparator();
		jj.add(m33);
		jj.addSeparator();
		jj.add(m34);
		jj.addSeparator();
		jj.add(m35);
		jj.addSeparator();
		mb.add(jj);
		
		pp=new JMenu("Result");
		m36=new JMenuItem("Insert");
		m37=new JMenuItem("Delete");
		m38=new JMenuItem("Find");
		m39=new JMenuItem("Update");
		m40=new JMenuItem("Show All");
		
		m36.addActionListener(this);
		m37.addActionListener(this);
		m38.addActionListener(this);
		m39.addActionListener(this);
		m40.addActionListener(this);
		
		pp.add(m36);
		pp.addSeparator();
		pp.add(m37);
		pp.addSeparator();
		pp.add(m38);
		pp.addSeparator();
		pp.add(m39);
		pp.addSeparator();
		pp.add(m40);
		pp.addSeparator();
		mb.add(pp);
		
		
		
		setJMenuBar(mb);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		votingsystemjmenubaar obj=new votingsystemjmenubaar();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==m1)
		{
			new citymastersave();
		}
		if(e.getSource()==m2)
		{
			new citymasterdelete();
		}
		if(e.getSource()==m3)
		{
			new citymasterfind();
		}
		if(e.getSource()==m4)
		{
			new citymasterupdate();
		}
		if(e.getSource()==m5)
		{
			new citymastershow();
		}
		if(e.getSource()==m6)
		{
			new voterssave();
		}
		if(e.getSource()==m7)
		{
			new votersdelete();
		}
		if(e.getSource()==m8)
		{
			new votersfind();
		}
		if(e.getSource()==m9)
		{
			new votersupdate();
		}
		if(e.getSource()==m10)
		{
			new votersshow();
		}
		if(e.getSource()==m11)
		{
			new electionschedulesave();
		}
		if(e.getSource()==m12)
		{
			new electionscheduledelete();
		}
		if(e.getSource()==m13)
		{
			new electionschedulefind();
		}
		if(e.getSource()==m14)
		{
			new electionscheduleupdate();
		}
		if(e.getSource()==m15)
		{
			new electionscheduleshow();
		}
		if(e.getSource()==m16)
		{
			new votingdatasave();
		}
		if(e.getSource()==m17)
		{
			new votingdatadelete();
		}
		if(e.getSource()==m18)
		{
			new votingdatafind();
		}
		if(e.getSource()==m19)
		{
			new votingdataupdate();
		}
		if(e.getSource()==m20)
		{
			new votingdatashow();
		}
		if(e.getSource()==m21)
		{
			new partymastersave();
		}
		if(e.getSource()==m22)
		{
			new partymasterdelete();
		}
		if(e.getSource()==m23)
		{
			new partymasterfind();
		}
		if(e.getSource()==m24)
		{
			new partymasterupdate();
		}
		if(e.getSource()==m25)
		{
			new partymastershow();
		}
		if(e.getSource()==m26)
		{
			new wardmastersave();
		}
		if(e.getSource()==m27)
		{
			new wardmasterdelete();
		}
		if(e.getSource()==m28)
		{
			new wardmasterfind();
		}
		if(e.getSource()==m29)
		{
			new wardmasterupdate();
		}
		if(e.getSource()==m30)
		{
			new wardmastershow();
		}
		if(e.getSource()==m31)
		{
			new cadidatessave();
		}
		if(e.getSource()==m32)
		{
			new cadidatesdelete();
		}
		if(e.getSource()==m33)
		{
			new cadidatesfind();
		}
		if(e.getSource()==m34)
		{
			new cadidatesupdate();
		}
		if(e.getSource()==m35)
		{
			new cadidatesshow();
		}
		if(e.getSource()==m36)
		{
			new resultsave();
		}
		if(e.getSource()==m37)
		{
			new resultdelete();
		}
		if(e.getSource()==m38)
		{
			new resultfind();
		}
		if(e.getSource()==m39)
		{
			new resultupdate();
		}
		if(e.getSource()==m40)
		{
			new resultshow();
		}



		
	}
	

}
