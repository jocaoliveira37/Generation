import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CardInstituiComponent } from './card-institui.component';

describe('CardInstituiComponent', () => {
  let component: CardInstituiComponent;
  let fixture: ComponentFixture<CardInstituiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CardInstituiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CardInstituiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
